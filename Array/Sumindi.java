package Array;

import java.util.Arrays;

public class Sumindi {
	public static void main(String[] args) {
		int[] arr={121,721,146,348};
		int[] arr1=new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			
			int num=arr[j];
			int sum=0;
			while(num!=0){
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			arr1[j]=sum;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
