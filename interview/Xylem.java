package interview;
import java.util.Scanner;

public class Xylem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a anumber:");
		int no=sc.nextInt();
		sc.close();
		int copy=no;
		int osum=0;
		int isum=0;
		while(no!=0){
		if(no==copy||no<=9)
			osum=osum+no%10;
		else
			isum=isum+no%10;
		no=no/10;
		}
		if(isum==osum)
			System.out.println("It is a xylem number:");
		else
			System.out.println("It is a phloem number");
		}

}
