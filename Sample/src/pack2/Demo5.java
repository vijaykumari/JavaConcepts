package pack2;

public class Demo5 {
	
	public static void registration(String userName,String password,String emailId,long phoneNumber) {
		System.out.println("First Registration done....");
	}

	public static void login(String userName,String password) {
		System.out.println("Second Login done");
		logout();
	}

	public static void logout() {
		System.out.println("Third logout done");
	}

	public static void main(String[] args) {

		registration("xyz", "1234", "abc@gmail.com", 1234567890);
		login("xyz", "1234");
	}

}
