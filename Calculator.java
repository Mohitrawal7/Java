import java.util.*;
class Calculator {
    public static void main(String args[]){

  char op;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your two number accordingly");
 int a = sc.nextInt();
 int b = sc.nextInt();

//  double result;
//  result = sc.nextDouble();
 
System.out.println("Enter the operation");
 op = sc.next().charAt(0);

 switch(op){
 case '+' : int sum = a+b;
 System.out.println(sum);
 break;
 case '-' :if(a>b){
 int diff = a-b;
 System.out.println(diff);
 }else{
 int diff = b-a;
 System.out.println(diff);
 }
 break;
 case '*':
  int mul = a*b;
 System.out.println(mul);
 break;
 case '/':
double div = (double) a/b;
 System.out.println(div);
 break;

  }
  sc.close();
 }
}