package pack;

public class Demo5 {

	public void m1() {
		System.out.println("Hello m1..");
	}

	public static void m2() {
		System.out.println("Hello m2....");
	}

	public static void main(String[] args) {
		Demo5 d=new Demo5();
		d.m1();
		m2();
	}

}
