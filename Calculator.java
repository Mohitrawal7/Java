import java.util.*;
class Calculator {
    public static void main(String args[]){

  char op;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your two number accordingly");
 int a = sc.nextInt();
 int b = sc.nextInt();
 double result;
 result = sc.nextDouble();
 System.out.println("Enter the operation");
  Scanner input;
    op = input.next().charAt(0);
 switch(op){
 case "+" : int sum = a+b;
 System.out.println(sum);
 break;
 case "-" :if(a>b){
 int diff = a-b;
 System.out.println(diff);
 }else{
 int diff = b-a;
 System.out.println(diff);
 }
 break;
 case "*":
  int mul = a*b;
 System.out.println(mul);
 break;
 case "/":
 if (a>b){
 int div =a/b;
 }else{
 int div = b/a;
 }
 System.out.println(div);
 break;

  }
  input.close();
 }
}