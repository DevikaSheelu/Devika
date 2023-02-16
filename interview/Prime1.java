package interview;
import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no1:");
		int no1=sc.nextInt( );
		System.out.println("Enter a no2:");
		int no2=sc.nextInt( );
		sc.close( );
		loop(no1,no2);
		}
	 static void loop(int no1,int no2){
		for(int i=no1; i<=no2;i++){
			int no=i;
			boolean flag=true;
			for(int j=2;j<no;j++)
			{
				if(no%j==0){
					flag=false;
					break;
					
				}
				
			}
			if(flag==true){
				System.out.println(no+" Its a prime number");
			}
			else{
				System.out.println(no+" Its not a prime number");
			}
		}
	}

}
