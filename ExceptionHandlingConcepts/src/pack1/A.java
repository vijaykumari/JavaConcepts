package pack1;

public class A {

	
	public void m(String str){
		
		System.out.println("hello");
		try{
		System.out.println(str.length());
		}catch(Exception ex){
			System.out.println(" you have passed null");
		}
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m("hello how are you");
	}
}
