package Testcase;

public class Testcase1 {
	public static boolean loop(int no1,int no2){
		if( no1==10 || no2==10 ||no1+no2==10 ){
			return true;
		}
		else{
		return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(loop(9,10));
		System.out.println(loop(9,9));
		System.out.println(loop(9,1));
	}
	

}
