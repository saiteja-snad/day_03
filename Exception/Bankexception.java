package Texception;
import java.util.*;

class InvalidamountException extends Exception{
	InvalidamountException(String msg){
		super(msg);
	}
}
public class Bankexception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int balance=sc.nextInt();
	 try {
		int withdraw=sc.nextInt();
		if(withdraw >balance) {
			throw new InvalidamountException("Insufficient Balance");
	}else {
		System.out.print("Withdraw Success");
	}
	 }
		catch(InvalidamountException e) {
			System.out.println(e);
		}
}
}
