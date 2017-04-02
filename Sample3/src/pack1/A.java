package pack1;

public class A {

	/*
	 * int a=100; int b=200;
	 */

	/*int a = 1000, b = 200;

	public void m() {
		if (a > b) {
			System.out.println("a is big");
		}
	}*/
	
	public void m(int a, int b){
		if (a > b) {
			System.out.println("a is big");
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.m(100,200);

	}

}
