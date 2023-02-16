package Patterns;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String s1=sc.nextLine();
	sc.close();
	String[] str=s1.split(" ");
	System.out.println(Arrays.toString(str));
	for (int i = 0; i < str.length; i++) {
		String str1=str[i];
		if(true){
			System.out.print(str1.charAt(0)+" ");
		}
		
		
	}
	
}
}
