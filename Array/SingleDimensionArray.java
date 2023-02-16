package Array;

public class SingleDimensionArray {
   int[] arr=null;
   public SingleDimensionArray(int arrsize){
	   int[] arr=new int[arrsize];
	   for (int i = 0; i < arr.length; i++) {
		arr[i]=Integer.MIN_VALUE;
	}
   }
   public void ArrayInsertion(int loc,int values){
	   if(arr[loc]==Integer.MIN_VALUE){
		   arr[loc]=values;
		   System.out.println("the values is successfully inserted");
	   }
	   else{
		   System.out.println("the cell is already inserted");
	   }
   }
   public void ArrayTraversal(){
	   for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
   }
}

