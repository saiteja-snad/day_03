package Oops_day2;
class Animal3{
	String name;
	Animal3(String name){
		this.name=name;
		
	}
	void sound() {
		System.out.println("sasun.................");
		System.out.println(name);
	}
}

class Dog5s extends Animal3{
	int age;
	Dog5s( String name,int age){
		super(name);
		super.sound();
		this.age=age;
	}
	void sound() {
		System.out.println("gchjkklhjgg-------------------");
		System.out.println(name+" "+age);
	}
	
	
}
public class Methodoverride {
public static void main(String[] args) {
	Dog5s obj=new Dog5s("sam",20);
	obj.sound();
	
}
}
