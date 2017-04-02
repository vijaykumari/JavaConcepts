package pack1;

public class B {

	public void m(int a, int b) {
		if (a > b) {
			System.out.println("a is big");
		}
		else{
			System.out.println("b is big");
		}
	}

	public static void main(String[] args) {
		B b1 = new B();
		b1.m(1000, 200);
	}

}
