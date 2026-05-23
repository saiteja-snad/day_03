package Oops_day2;

class Animals{
	String name;
	String bread;
	 Animals(){
		 
	 }
	Animals (String name){
		this.name=name;
		
	}
	 void sound() {
		 System.out.println("Animals sounds");
		 System.out.println("Animal name");
	       
	 }
}
class Dog extends Animals{
	String name;
	int age;
	Dog(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void sounds() {
		System.out.print("dog sound barking.........");
		System.out.println("Dog name is : " + name);
        System.out.println("Dog age is : " + age);
	}
}



public class SingleIn {
	public static void main(String[] args) {
		Dog obj=new Dog("jam",20);
		obj.sound();
		obj.sounds();
		
		
	}
}
