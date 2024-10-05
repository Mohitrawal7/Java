import java.util.*;
class Patterns{
public static void main (String args[]){
 int n = 5;

//for butterfly

//for upper half
 /*for(int i=1;i<=n;i++){
  //for first star
for(int j=1;j<=i;j++)
System.out.print("*");
//for spaces
for(int j=1;j<=2*(n-i);j++)
System.out.print(" ");
//for last star
for(int j=1;j<=i;j++)
System.out.print("*");
System.out.println("");
}
//for lower half
 for(int i=n;i>=1;i--){
  //for first star
for(int j=1;j<=i;j++)
System.out.print("*");
//for spaces
for(int j=1;j<=2*(n-i);j++)
System.out.print(" ");
//for last star
for(int j=1;j<=i;j++)
System.out.print("*");
System.out.println("");
}
*/


//for hollow butterfly
//for upper half
 for(int i=1;i<=n;i++){
  //for first star
for(int j=1;j<=i;j++){
if(j==1 || j==i){
System.out.print("*");
}else
System.out.print(" ");
}
//for spaces
for(int j=1;j<=2*(n-i);j++)
System.out.print(" ");
//for last star
for(int j=1;j<=i;j++){
if(j==1 || i==j){
System.out.print("*");
}else
System.out.print(" ");
}
System.out.println("");
}
//for lower half
 for(int i=n;i>=1;i--){
  //for first star
for(int j=1;j<=i;j++){
if(j==1 || i==j){
System.out.print("*");
}else
System.out.print(" ");
}
//for spaces
for(int j=1;j<=2*(n-i);j++)
System.out.print(" ");
//for last star
for(int j=1;j<=i;j++){
if(j==1 || i==j){
System.out.print("*");
}else
System.out.print(" ");
}
System.out.println("");
}

  }
}