import java.util.*;
class Calculator {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your two number accordingly \n");
 int a = sc.nextInt();
 int b = sc.nextInt();
 System.out.println("Enter the operation");
 char op = sc.nextChar();
 switch(op){
 case "+" : int sum = a+b;
 System.out.println(sum);
 break;
 case "-" :if(a>b){
 int diff = a-b;
 System.out.println(diff);
 }else{
 diff = b-a;
 System.out.println(diff);
 }
 break;
 case "*": int mul = a*b;
 System.out.println(mul);
 break;
  }
 }
}