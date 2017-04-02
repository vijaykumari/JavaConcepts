package pack2;

public class B {

	String name = "Hello xyz ,how are you";
	String city1 = "Bangalore";
	String name1="abcd";
	String name2="xyza";
	

	String city2 = "    pune";
	String orderNumber = "Transaction #ordrer number is #123ABD45678"; 
	String[] x=orderNumber.split("#");

	public void m1() {
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(6, 9));
		System.out.println(name.substring(11));
		System.out.println(name.charAt(10));
		System.out.println(city1.equals("Bangalore"));// true
		System.out.println(city1.equalsIgnoreCase("bangalore"));// true
		System.out.println(city2);
		System.out.println(city2.trim());
		//char[] ch=orderNumber.toCharArray();
		//for each loop
		/*for(String str:orderNumber.split("#")){
			System.out.println(str);
			
		}*/
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(name.startsWith("Hello"));
		System.out.println(name.endsWith("you"));
		System.out.println(name);
		System.out.println(name.replace("Hello", "Hi"));
		//System.out.println(name1.compareTo(name2));
		//System.out.println(name.);
	}

	public static void main(String[] args) {
		new B().m1();
	}

}
