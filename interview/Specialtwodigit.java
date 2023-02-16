package interview;
import java.util.Scanner;

public class Specialtwodigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		int d1=num%10;
		int d2=num/10;
		int sum=d1+d2+(d1*d2);
		if(sum==num)
			System.out.println("Special two digit number");
		else
			System.out.println("Not a special two digit number");
		}

}
