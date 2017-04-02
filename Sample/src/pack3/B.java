package pack3;

public class B extends A {

	public void mul() {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		B b = new B();
		b.mul();
		b.add();
		
		A a=new A();
		a.add();
		
	}

}
