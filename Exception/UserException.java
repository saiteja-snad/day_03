package Texception;
import java.util.*;
 class InvalidageException extends Exception{
	 InvalidageException(String msg){
		 super(msg);
	 }
	 
 }
 
 
public class UserException {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	try {
      if(age<18) {
    	  throw new InvalidageException("under age");
      }
      else {
    	  System.out.println("welcome  to the party");
      }
	}
	catch(InvalidageException e) {
		System.out.println(e);
	}
	}
	

}
