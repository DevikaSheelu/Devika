package interview;
import java.util.Scanner;
import java.util.Arrays;

public class Nthmax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index of an array:");
		int n=sc.nextInt();
		sc.close();
		int[] arr={10,82,1,23,15,47};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-n]);
		
		
	}

}
