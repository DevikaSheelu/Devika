package DS;
import java.util.Scanner;
public class RedBusBooking {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RedBus r=new RedBus(20);
		System.out.println("Welcome to REDBUS online ticket bookings");
		System.out.println("select hoe many seats you want");
		System.out.println("************************************************************");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("choose the location and seat number");
			r.ticketBooking(sc.nextInt(),sc.nextInt());
		}
		System.out.println("would you please check your ticket confirmation");
		int a=sc.nextInt();
		if(a==1){
			r.ticketconfremation();
		}
	}
}
