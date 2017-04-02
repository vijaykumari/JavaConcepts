package p1;

public class O1 {
	
	int i=100;
	P p=new P();//object created for parent
	public void m2(){
		System.out.println(p.name);//default
		System.out.println(p.a+i);//public 
		//System.out.println(p.b);//private
		System.out.println(p.c);//protected
	}
	
	/*public static void main(String[] args) {
		O1 o=new O1();
		o.m2();
	}*/

}
