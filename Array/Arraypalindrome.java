package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraypalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater an array size:");
		int n=sc.nextInt();
		int[] array=new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		boolean b=sample(array);
		System.out.println(b);
	}
	    static boolean sample(int[ ] array){
		int[] array1=new int[array.length];
		for (int j = 0; j<array.length;j++) {
			array1[j]=array[array.length-1-j];
		}
		if(Arrays.equals(array, array1))
			return true;
		else
			return false;
	}

}
