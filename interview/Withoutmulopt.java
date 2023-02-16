package interview;
import java.util.Scanner;

public class Withoutmulopt {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int no=sc.nextInt( );
    int i=1;
    int sum=0;
    while(i<=10){
    	sum=sum+no;
    	System.out.println(sum+" ");
    	i++;
    }
    sc.close( );
	}
    
    

}
