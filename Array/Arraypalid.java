package Array;

import java.util.Scanner;

public class Arraypalid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter an array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			}
		sc.close();
		System.out.println(disp(arr));
		}
	private static boolean disp(int[] arr){
		int i=0;
		int j=arr.length-1;
		while(i<=arr.length/2){
			if(arr[i]!=arr[j]){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	

}
