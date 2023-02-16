package Tricky;

public class Static {
	int a=10;
	public static void main(String[] args) {
		Static s1=new Static();
		s1.a=20;
		Static s2=new Static();
		s2.a=30;
		System.out.println(s1.a);
		System.out.println(s2.a);
		
		
	}

}
