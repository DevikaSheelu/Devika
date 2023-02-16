package interview;
import java.util.Scanner;
public class Swap3o {
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
			a=a+b+c;
			b=a-(b+c);
			c=a-(b+c);
			a=a-(b+c);
		    System.out.println("after swap value of a is"+a);
			System.out.println("after swap value of b is"+b);
			System.out.println("after swap value of c is"+c);
			}

	}
