package pack6;

public class Child extends Parent {
	
	
	public void design(){
		System.out.println("Child new  implementation..200cc bike..");
	}
	//method overriding
	
	public static void main(String[] args) {
		Child c=new Child();
		c.design();
		
		Parent p=new Parent();
		p.design();
	}
	

}
