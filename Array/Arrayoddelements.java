package Array;

import java.util.Scanner;

public class Arrayoddelements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size:");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter an array elements:");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
			
		}
		sc.close();
		System.out.println(devika(array));
		
	}

	private static boolean devika(int[] array) {
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==1)
				count++;
		}
		if(count>3)
		    return true;
		else
			return false;
	}
	

}
