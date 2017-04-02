package pack2;

public class Demo4 {
	
	
	public static void registration() {
		System.out.println("First Registration");
	}

	public static void login() {
		registration();
		System.out.println("Second Login");
		logout();
	}

	public static void logout() {
		System.out.println("Third logout");
	}

	public static void main(String[] args) {
		login();
	}

}
