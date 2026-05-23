package Oops_day2;

class Animal{
	public void typeAnimal() {
		System.out.println("dog and cat");
	}
}

class Dogs extends Animal{
	public void isDog() {
		System.out.println("hi i am dog");
	}
	
}


class Cat extends Dogs{
	public void isCat() {
		System.out.println("hi iam cat......");
	}
	
}

public class MutiInt {
public static void main(String[] args) {
	Cat obj=new Cat();
	obj.isCat();
	obj.isDog();
	obj.typeAnimal();
}
}
