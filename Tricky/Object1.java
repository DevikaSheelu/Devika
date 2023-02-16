package Tricky;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Object1 {

public static void main(String[] args) {
	 String str="apple applet application";
	 String str1[]=str.split(" ");
	 for (int i = 0; i < str1.length; i++) {
		String str2=str1[i];
		String str3="";
		for (int j = 0; j < 4; j++) {
			str3=str3+str2.charAt(j);
		}
		System.out.print(str3+" ");
	}
}
}

