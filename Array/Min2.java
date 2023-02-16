package Array;

public class Min2 {
	public static void main(String[] args) {
		int[] arr={5,1,6,3,8,4,1};
		int min2=0;
		int min1=5;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min1){
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2){
				min2=arr[i];
			}
			
		}
		System.out.println(min2);
	}

}
