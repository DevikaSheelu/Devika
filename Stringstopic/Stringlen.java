package Stringstopic;

public class Stringlen {
	public static void main(String[] args) {
		String str="my name is devika";
		String ch[]=str.split(" ");
		for (int i = 0; i < ch.length; i++) {
			if(i==0){
			String  str1=ch[0];
			for (int j = str1.length()-1; j >=0; j--) {
	
				System.out.print(str1.charAt(j));
			}
		 }
			else{
				System.out.print(" "+ch[i]);
			}
		}
	}

}
