package pack2;

public class B extends A{
	int a=100, b=200;
	public void add(){
		System.out.println(super.a+b);
	}
			
	public static void main(String[] args) {
		B bb=new B();
		bb.add();
	}
}
