package pack2;

public class Demo3 {
	
	public void registration(String userName,String password,String emailId,long phoneNumber) {
		System.out.println("First Registration done....");
	}

	public void login(String userName,String password) {
		System.out.println("Second Login done");
		logout();
	}

	public void logout() {
		System.out.println("Third logout done");
	}

	public static void main(String[] args) {

		Demo3 d=new Demo3();
		d.registration("xyz", "1234", "abc@gmail.com", 1234567890);
		d.login("xyz", "1234");
		
		
	}

}
