package Oops_day2;

public interface Multipleinterface {
    void anu();
    void sai();
    void prasad();
}

interface Trainee{
	 void task();
	 void done();
	 void pending();
}

class Full implements Trainee,Multipleinterface{
	public void anu() {
		System.out.println("hi anu");
	}
	public void sai() {
		System.out.println("hi sai");
	}
	public void prasad() {
		System.out.println("hi prasad");
	}
	public void task() {
		System.out.println("task given by pavan");
	}
	public void done() {
		System.out.println("task completed ");
	}
	public void pending() {
		System.out.println("task is pending");
	}
}

class Salary{
	public static void main(String[] args) {
		Full obj=new Full();
		obj.anu();
		obj.sai();
		obj.prasad();
		obj.task();
		obj.done();
		obj.pending();
	}
}
