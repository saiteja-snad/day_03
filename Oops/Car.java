package Oops_day2;

public class Car {
      public void brand() {
    	  System.out.println("tata   tvs  hero");
      }

}
class Bike {
	Car obj=new Car();
	
	public void run() {
	obj.brand();
	 System.out.println("hi iam tata");
	 System.out.println("hi iam tvs");
	 System.out.println("hi iam hero");
	}
}

class Person{
	public static void main(String[] args) {
		
	
	Bike obj1=new Bike();
	
		obj1.run();
		System.out.println("hi iam sai");
	}
	}

