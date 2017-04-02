package pack2;

public class Demo2 {

	public void registration() {
		System.out.println("First Registration");
	}

	public void login() {
		registration();
		System.out.println("Second Login");
		logout();
	}

	public void logout() {
		System.out.println("Third logout");
	}

	public static void main(String[] args) {
		Demo2 d = new Demo2();
		
		d.login();
	}

}
