package pack1;

public class AA {
	
	
	public void m(int a, int b) {
		if (a > b) {
			System.out.println("a is big");
		}
		
		else if(a==b){
			System.out.println("a and b are equal...");
		}
		else{
			System.out.println("b is big");
		}
	}
	public static void main(String[] args) {
	AA a=new AA();
	a.m(1000, 1000);
	}

}
