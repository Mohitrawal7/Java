import java.util.*;
class FirstClass {
    public static void main(String args[]){
        //output
      //  System.out.println("Hello World with java");
      // System.out.print("*\n**\n***");

      //variables
    /*   int a = 10;
      int b = 22;
      int sum = a+ b;
      System.out.println(sum);
      int diff= b-a;
      System.out.println(diff);
      */

      //input
    //  Scanner sc = new Scanner(System.in);
    //  String name = sc.next();
    //  System.out.println(name);

      //code
      Scanner sc = new Scanner(System.in);
     /* int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a+b;
      System.out.println(sum);
	*/
	//conditional 
	int age = sc.nextInt();
	if(age>=18){
	System.out.println("Adult");	
	} else {
	 System.out.println("Not Adult");
	}
    }
}
