package interview;
import java.util.Scanner;
public class Happy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number..");
		int num=sc.nextInt( );
		sc.close();
		while(num>9){
			int sum=0;
			while(num!=0){
				int rem=num%10;
				sum=sum+rem*rem;
				num=num/10;
				}
			System.out.println(sum);
			num=sum;
		}
		if(num==1||num==7){
			System.out.println("Happy number");
		}
		else{
			System.out.println("Not a happy number");
		}
		
		
	}
	
}
