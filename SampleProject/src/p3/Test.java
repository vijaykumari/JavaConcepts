package p3;

public class Test extends A {
	
	public void m3(){
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		
		A a=new Test();
		a.m1();
		a.m2();
	}

	public void m1() {

	}

}
