package Testcase;

public class Testcase2 {
	public static int loop(int a,int b){
		if(a!=b){
			return a+b;
		}
		else{
			return 2*(a+b);
		}
	}
	public static void main(String[] args) {
		System.out.println(loop(1,2));
		System.out.println(loop(3,2));
		System.out.println(loop(2,2));
	}

}
