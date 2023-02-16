package interview;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	static void loop(String str1,String str2){
		boolean flag=true;
		if(str1.length() == str2.length()){
			char[ ] ch1=str1.toCharArray();
			char[ ] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for(int i=0;i<ch1.length;i++){
				if(ch1[i]!=ch2[i]){
					flag=false;
					break;
				}
			}
				if(flag==true){
					System.out.println("anagram");
					}
				else{
					System.out.println("not anagram");
				}
			}
				else{
					System.out.println("string length are not same");
				}
			}
			public static void main(String[ ] args){
				Scanner sc=new Scanner(System.in);
				System.out.println("enter 1st string");
				String str1=sc.nextLine( );
				System.out.println("enter 2nd string");
				String str2=sc.nextLine( );
			     loop(str1,str2);
				}
	}

