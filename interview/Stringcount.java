package interview;
import java.util.Scanner;

public class Stringcount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine( );
		sc.close( );
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '){
				count++;
			}
		}
		System.out.println(count);
		
		
		
			
	}
	

}
