package p4;

public class AA implements Inter1 {

	public void mm1() {

	}

	public void mm2() {

	}

	public static void main(String[] args) {
		AA a = new AA();
		a.mm1();
		a.mm2();
		
		//Inter1 i=new Inter1();//can't create object for interface
		
		Inter1 i=new AA();
		i.mm1();
		//i.mm2()//can't access child property through interface reference
		
		
	}

}
