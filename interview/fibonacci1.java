package interview;
import java.util.Scanner;

public class fibonacci1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int no=sc.nextInt();
		loop(no);
		}
		static void loop(int no)
		{
	    int fib1=0;
		int fib2=1;
		int fib3;
		for(int i=0;i<no;i++){
			if(i<=1){
				fib3=i;
			}
			else{
			
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
				}
			System.out.print(fib3+" ");
			
		}
		}
		
		
	}
