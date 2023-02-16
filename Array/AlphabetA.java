package Array;

import java.util.Scanner;

public class AlphabetA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		sc.close();
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n; j++) {
				if((i==1&&j>=2)||(i==2&&j>=3)||(i==3&&j>=4)||(i==4&&j>=5)){
					System.out.print("#");
				}
			else{
				System.out.print("*");
			}
		}
			System.out.println();
	
			
		}
	}

}
