package interview;
import java.util.Scanner;
public class Swap2t {
	public static void main(String[ ] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		System.out.println("Enter value of c:");
		int c=sc.nextInt();
		System.out.println("before swap value of a is "+a);
		System.out.println("before swap value of b is "+b);
		System.out.println("before swap value of c is "+c);
		int temp=a;
		a=c;
		c=b;
		b=temp;
		System.out.println("after swap value of a is"+a);
		System.out.println("after swap value of b is"+b);
		System.out.println("after swap value of c is"+c);
		}

}
