package interview;
import java.util.Scanner;
public class armstrong {
	static void number(int no){
		int sum=0;
		int copy=no;
		while(no!=0){
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(copy==sum){
			System.out.println(copy+" is armstrong number");
		}
		else{
			System.out.println(copy+" is not armstrong number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt( );
		number(x);
		sc.close( );
	}

}
