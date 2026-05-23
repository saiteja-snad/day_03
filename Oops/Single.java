package Oops_day2;

public interface Single {
void sai();
static void ram() {
	System.out.print("hi iam ram so of sam");
}
}

class Jam implements Single{
	public void sai() {
		System.out.println("hi this is sai ");
	}
	void sam() {
		System.out.println("rara na vera");
	}
}
 class King {
	 public static void main(String[] args) {
		Jam obj=new Jam();
		obj.sai();
		obj.sam();
		Single.ram();
	}
 }
