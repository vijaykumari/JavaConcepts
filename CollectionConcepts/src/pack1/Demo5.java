package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo5 {

	Map<String, String> map = new HashMap<String, String>();

	public void m5() {
		map.put("100", "vijaykumari");
		map.put("101", "snageetha");
		map.put("102", "xyz");
		map.put("103", "vijaykumari");
		map.put("104", null);
		map.put("103","lmn");
		map.put(null,"pqr");

		for (Entry<String, String> m : map.entrySet()) {

			System.out.println(m.getKey() + "    " + m.getValue());

		}
	}

	public static void main(String[] args) {
		Demo5 d5 = new Demo5();
		d5.m5();
	}

}
