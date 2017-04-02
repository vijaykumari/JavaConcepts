package pack1;

public class AAA {


	public void m(int a, int b,int simplification) {
		switch (simplification) {
		case 1:
			System.out.println("addition   :"+(a+b));
			break;
		case 2:
			System.out.println("multiplication  :"+(a*b));
			break;
		default:
			System.out.println("no simplification ");
			break;

		}
	}
	
	public void m1(int a, int b,String simplification) {
		switch (simplification) {
		case "add":
			System.out.println("addition   :"+(a+b));
			break;
		case "mul":
			System.out.println("multiplication  :"+(a*b));
			break;
		default:
			System.out.println("no simplification ");
			break;

		}
	}

	public static void main(String[] args) {
AAA a=new AAA();
//a.m(10, 20,3);
a.m1(10, 20, "add");
a.m1(10, 20, "mul");
a.m1(10,20, "add");

	}

}
