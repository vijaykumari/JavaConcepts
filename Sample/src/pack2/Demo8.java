package pack2;

public class Demo8 {
	
	public void m1(){
		System.out.println("this is non static ");
	}
	public static void m2(){
		Demo8 d=new Demo8();
		d.m1();
		System.out.println("this is static");
	}

	public static void main(String[] args) {
m2();
	}

}
