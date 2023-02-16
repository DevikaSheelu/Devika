package Array;
import java.util.Arrays;

public class Arraytochar {
	public static void main(String[] args) {
		int[] arr={3,9,5,6,4};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int n=arr[i];
			int n1=65-1;
			char ch=(char)(n+n1);
			System.out.print(ch);
			
		}
		
		
	}

}
