package pack1;

public class A {
	static String name = "Hello";
	// String name=new String("Hello ");
	String str1 = name.concat(" xyz");

	static StringBuilder name1 = new StringBuilder("Hi  ");

	public void m1String() {

		System.out.println(name);
		System.out.println(str1);
		System.out.println(name);
	}

	public void m2StringBuffer() {

		System.out.println(name1);
		System.out.println(name1.append(" lmn"));
		System.out.println(name1);
		
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1String();
		System.out.println();
		System.out.println();
		a1.m2StringBuffer();

	}

}
