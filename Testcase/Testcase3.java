package Testcase;

public class Testcase3 {
	public static boolean loop(boolean b,int hour){
		 if(hour<=23){
		   if((b==true) && (hour<7 || hour>20 ))
		   {
			return true;
		   }
		   else{
			return false;
		   }
		}
		 return false;
	}
	public static void main(String[] args) {
		System.out.println(loop(true,6));
		System.out.println(loop(true,7));
		System.out.println(loop(false,6));
		
	}

}
