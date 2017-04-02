package p2;

import p1.P;

public class C2 extends P {
	
	
	public void m3(){
		//System.out.println(name); we can't access parent default property inside the child class(other package)
	System.out.println(a);//public
	//System.out.println(b);//private
	System.out.println(c);//protected
	}

}
