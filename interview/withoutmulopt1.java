package interview;
import java.util.Scanner;

public class withoutmulopt1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt( );
		int i=1;
		int sum=0;
		while(i<=10){
			sum=sum+no;
			i++;
		}
		System.out.println(sum);
		sc.close( );
		
			
	}

}
