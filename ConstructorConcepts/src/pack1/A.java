package pack1;

public class A {
	
	public A(){
		System.out.println("parameter less constructor");
	}
	
	public A(int a, int b){
		this();
		System.out.println("two parameters constructor  :"+(a+b));
	}
	public A(int a, int b,int c){
		this(a,b);
	System.out.println("three parameters constructor   :"+(a+b+c));	
	}
	
	/*public void m1(){
		System.out.println("hello");
	}*/
	
	public static void main(String[] args) {
		A a=new A(11,21,12);
		//a.m1();
	}

}
