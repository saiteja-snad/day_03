package Oops_day2;

abstract class Vechile{
	abstract void speed();
	void color() {
		System.out.print("color red");
	}
	
}
class Car1 extends Vechile{
	void speed() {
		int speed=120;
		System.out.println(speed);
	}
	void sm() {
		System.out.println("asjdas----------------------");
	}
}


public class Abstraction {
public static void main(String[] args) {
	Car1 obj=new Car1() ;
		obj.sm();
		obj.speed();
	}
}

