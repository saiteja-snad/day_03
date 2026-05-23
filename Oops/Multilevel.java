package Oops_day2;

public interface Multilevel {
   void pay2(int a);
   void refund2(int b);
   
}
 
 interface M extends Multilevel {
	   void pay1(int a);
	   void refund1(int b);
	   
	}

 interface Mu extends Multilevel {
	   void pay(int a);
	   void refund(int b);
	   
	}
 class E implements Mu{
	 public void pay(int a) {
		 System.out.println("Paid using Credit Card: " + a);
	    }
	 public void refund(int a) {
	        System.out.println("Refund to Credit Card: " + a);
	    }
	 public void pay1(int a) {
		 System.out.println("Paid using Credit Card: " + a);
	    }
	 public void refund1(int a) {
	        System.out.println("Refund to Credit Card: " + a);
	    }
	 public void pay2(int a) {
		 System.out.println("Paid using Credit Card: " + a);
	    }
	 public void refund2(int a) {
	        System.out.println("Refund to Credit Card: " + a);
	    }
	 }
 class T {
	 public static void main(String[] args) {
		E obj=new E();
	obj.pay(500);
	obj.refund(200);
	obj.pay1(500);
	obj.refund1(200);
	obj.pay2(500);
	obj.refund2(200);
	}
 }
 