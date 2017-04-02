package pack1;

public class BB extends AA{

	public BB(){
		System.out.println("child constructor...");
	}
	
	public BB(int a, int b, int c){
		super(a,b);//33
		System.out.println(a+b+c);//66
	}
	
	public static void main(String[] args) {
		BB b=new BB(11,22,33);
	}
}
