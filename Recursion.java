public class Recursion {
  /*
public static void moveallx (String str ,int idx, int count ,String newString  ){
if(idx==str.length()){
for(int i=0;i<count;i++){
newString += 'x';
}
System.out.println(newString);
return ;
}
char currChar = str.charAt(idx);
if(currChar == 'x'){
count++;
moveallx(str,idx+1,count,newString);
}else{
newString+= currChar;
moveallx(str,idx+1,count,newString);
}
return ;
}

public static void main (String args[]){
String str ="hgfxyfjxcfxcfx";
moveallx(str,0,0,"");
  }

*/
public static String removeDuplicates(String str, int idx, boolean present[]) {
if(idx == str.length()) {
return "";
}
char curr = str.charAt(idx);
if(present[curr-'a']) {
return removeDuplicates(str, idx+1, present);
} else {
present[curr-'a'] = true;
return curr + removeDuplicates(str, idx+1, present);
}
}
public static void main(String args[]) {
String str = "abhihjhggfcbcefghabi";
boolean present[] = new boolean[str.length()];
System.out.println(removeDuplicates(str, 0, present));
  }
}