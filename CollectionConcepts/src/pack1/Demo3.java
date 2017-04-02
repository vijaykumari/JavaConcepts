package pack1;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
	
	Set<String> set=new HashSet<String>();
	public void m3(){
		set.add("vijaykumari");
		set.add("sangeetha");
		set.add("xyz");
		set.add("vijaykumari");
		set.add(null);
		for(String s:set){
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		Demo3 d3=new Demo3();
		d3.m3();
	}

}
