package Oops_day2;

class Animal1{
	public void sound() {
		System.out.println("dog   and cat");
	}
}
class Dog2 extends Animal1{
	public void  dogie() {
		System.out.println("iam friend of humans");
	}
}

class Cat2 extends Animal1{
	public void cats() {
		System.out.println("iam close to some humans");
	}
	
}

public class Hierarchicalinher {
public static void main(String[] args) {
	Cat2 obj=new Cat2();
	Dog2 obj1=new Dog2();
	obj.cats();
	obj1.dogie();
	obj.sound();
	obj1.sound();
}
}
