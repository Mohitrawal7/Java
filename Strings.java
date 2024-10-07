import java.util.*;

public class Strings {
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
String last = sc.next();
String first = sc.next();
String full = first + " "+ last;
System.out.println(full);
//compare to
 int n = first.compareTo(last);
System.out.println(n);
//substring
String i = full.substring(4);
System.out.print(i);
}


}