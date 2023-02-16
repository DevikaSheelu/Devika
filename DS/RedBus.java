package DS;

public class RedBus {
	int[] arr=null;
	RedBus(int numberofseats){
		arr=new int[numberofseats];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.MIN_VALUE;
		}
	}
	//TICKET BOOKING
	public void ticketBooking(int loc,int num){
		try{
			if(arr[loc]==Integer.MIN_VALUE){
			arr[loc]=num;
			System.out.println("The seat number "+num+" is successfully booked");
		}
		else{
			System.out.println("the seat you looking for is alresdy booked choose another seat number");
		}
	 }
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid seat number.Tho seat capacity is 20 choose below that number");
		}
	}
	//TICKET CONFIRMATION
	public void ticketconfremation(){
		System.out.println("congrats yur seats are successfully booked");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=Integer.MIN_VALUE){
				System.out.println(arr[i]+" "+"\n");
		}
			System.out.println("********************************************************");
			
		}
	}

}
