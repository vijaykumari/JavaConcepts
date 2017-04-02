package pack1;

public class A {
	int[] a = { 1, 2, 3, 4, 5 };

	public void m1() {
		for (int j = 0; j < 3; j++) {
			System.out.println(a[j]);
		}
	}
	
	public void m2(){
		for(int x:a){
			System.out.println(x);
		}
	}
}
