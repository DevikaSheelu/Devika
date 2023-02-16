package Array;

class Mainclass {
  public static void main(String[] args) {
	  SingleDimensionArray sda=new SingleDimensionArray(5);
	  sda.ArrayInsertion(0,5);
	  sda.ArrayInsertion(1,6);
	  sda.ArrayInsertion(2,7);
	  sda.ArrayInsertion(3,8);
	  sda.ArrayInsertion(4,9);
	  sda.ArrayInsertion(5,10);
	  sda.ArrayInsertion(3,5);
	  sda.ArrayTraversal();
}
}
