import java.util.*;
class PascalPattern {
public static void main(String args[]){
//System.out.print("1");

int n =5;
 /*  //my code
for(int i=1;i<=n;i++){
 //for spaces
 for(int j=1;j<=2*(n-i);j++){
 System.out.print(" ");
}
//for number
for(int j=1;j<=i;j++){
System.out.print("1");
}
System.out.println("");
}
*/
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
         }

  }

}