package interview;
import java.util.Scanner;

public class Difference {
	public static int absolute(int no){
		if(no<21){
			return 21-no;
		}
		else{
			return 2*(no-21);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a number:");
		int no=sc.nextInt();
		System.out.println(absolute(no));
		sc.close();
		
	}
	

}
