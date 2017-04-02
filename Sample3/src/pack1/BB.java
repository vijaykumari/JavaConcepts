package pack1;

public class BB {

	public void m() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		BB b = new BB();
		b.m();
	}

}
