package pack2;

public class Demo1 {

	public void m1() {
		System.out.println("m1 is non static method...");
	}

	public static void m2() {
		System.out.println("m2 is static method...");
	}
	
	public void m3(int a, int b){
		System.out.println(a+b);
	}
	public static void m4(int a, int b){
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		m2();
		m4(10,200);
		
		
		Demo1 d=new Demo1();
		d.m1();
		d.m3(20,30);
	}

}
