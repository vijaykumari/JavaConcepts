package pack1;

public class A {

	public void addition() {
		System.out.println(10 + 12);
	}
	
	public void subtraction(){
		System.out.println(10-12);
	}
	
	public void multiplication(){
		System.out.println(10*12);
	}

	public static void main(String[] args) {
		A a = new A();//object creation
		a.addition();//method calling
		a.addition();
		a.subtraction();
		A b=new A();
		b.multiplication();
		b.addition();
		
	}

}
