package pack1;

import java.util.LinkedList;
import java.util.List;

public class Demo2 {
	List<String> list = new LinkedList<String>();

	public void m1() {
		list.add("vijaykumari");
		list.add("sangeetha");
		list.add("xyz");
		list.add("sangeetha");
		list.add(null);

		for (String s : list) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.m1();
	}

}