package interview;

public class Sum3midelement {                                           
	public static void main(String[] args) {
		int[] arr={10,82,1,23,2,15,47};
		if(arr.length%2==1){
			int sum=0;
			for(int i=arr.length/2-1;i<=arr.length/2+1;i++){
				sum=sum+arr[i];
			}
			System.out.println(sum);
		}
		else{
			System.out.println("There is no 3 middle element");
		}
	}

}
