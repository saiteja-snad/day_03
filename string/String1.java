//Reverse string
package Strings;
import java.util.*;
public class String1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String r="";
	for(int i=s.length()-1;i>=0;i--) {
		char ch=s.charAt(i);
		r=r+ch;
		System.out.print(ch);
		
	}
	System.out.println();

	
	if(s.equals(r)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palidrome");
	}
	sc.close();
}
}
