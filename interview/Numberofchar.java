package interview;
import java.util.Scanner;

public class Numberofchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		sc.close();
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++){
			String reverse="";
			String str2=str1[i];
			for(int j=str2.length()-1;j>=0;j--){
				reverse=reverse+str2.charAt(j);
			}
			System.out.print(reverse);
			System.out.print(" ");
			
		
		}
		
	}

}
