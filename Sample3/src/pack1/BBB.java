package pack1;

public class BBB {

	public void m() {
		int i = 100;
		while (i > 200) {
			System.out.println("Hello");
			break;
		}
	}
	public void m1() {
		int i = 100;
		do {
			System.out.println("Hello");
			
		}while (i > 200);
	}

	public static void main(String[] args) {
		BBB b = new BBB();
		//b.m();
		b.m1();
	}

}
