import java.util.*;

public class Strings {
public static void main (String args[]){
/*
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
*/

// String builder

StringBuilder sb = new StringBuilder("Tony");
//char st index 0
System.out.println(sb.charAt(0));

//set char at index 0
sb.setCharAt(0,'P');
System.out.println(sb);

//insert char at index 3 
sb.insert(3,'n');
System.out.println(sb);

//delete char at index 
sb.delete(2,3);
System.out.println(sb);

//append 
sb.append("o");
sb.append("t");
System.out.println(sb);

//question  -- reverse a string
StringBuilder s = new StringBuilder("wonosaplaal");
StringBuilder sn = new StringBuilder("");

for(int i=s.length()-1 ;i>=0;i--){
sn.append(s.charAt(i));
}
System.out.println(sn);


  }
}