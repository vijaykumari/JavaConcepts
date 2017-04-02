package pack6;

public class A {

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	//method overloaded  ex:add(int a, int b)----->add(int a, int b,int c)
	public void add(int a, int b, int c) {

		System.out.println(a + b+c);
	}

	public static void main(String[] args) {
		A a = new A();
		a.add(10, 20);
		a.add(11, 22, 33);
	}

}
