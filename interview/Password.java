package interview;
import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String...");
		String str=sc.nextLine();
		sc.close();
		
		if(str.length()>=8){
		int Ucount=0;
		int Lcount=0;
		int Ncount=0;
		int Scount=0;
		for(int i=0;i<str.length();i++){
				
				char ch=str.charAt(i);
				
				if(ch>='A'&&ch<='Z'){
					Ucount++;
				}else if(ch>='a'&&ch<='z'){
					Lcount++;
				}
				else if(ch>=1&&ch<=9){
					Ncount++;
					}
				else{
					Scount++;
				}
				}
			if(Ucount>=1 && Lcount>=1 && Ncount>=1 && Scount>=1 && str.charAt(str.length()-1)=='#'){
				System.out.println("valid password");
			}
			else{
				System.out.println("not a valid password");
			}
			
		}
		else{
			System.out.println("Enter a min of 8 characters.");
		}
		
	}

}
