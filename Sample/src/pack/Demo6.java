package pack;

public class Demo6 {

	public void m1() {
		System.out.println("Hello m1..");
		
		
		 m2(); m3(); m4();
		 
	}

	public void m2() {
		System.out.println("Hello m2....");
	}

	public static void m3() {
		//m1();//we can't access non static methods inside the static method
		System.out.println("Hello m3..");
		m4();
	}

	public static void m4() {
		System.out.println("Hello m4....");
	}

	public static void main(String[] args) {
		/*Demo6 d = new Demo6();
		d.m1();*/
		m3();
	}

}
