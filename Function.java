import java.util.*;
class Function {
public static void main (String args[]){
Scanner sc =new Scanner(System.in);
int zero=0,positive=0,negative=0;
System.out.println("Enter how many number are gonna be entered" );
int n = sc.nextInt();

System.out.println("Enter numbers");
for(int i=0;i<n;i++){
int num = sc.nextInt();
//checking number
if(num>0)
positive++;
else if(num<0)
negative++;
else
zero++;
}
System.out.println("Positive = " + positive);
System.out.println("Negative = " + negative);
System.out.print("Zero = " + zero);

 }

}