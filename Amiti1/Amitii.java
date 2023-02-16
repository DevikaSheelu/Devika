package Amiti1;

public class Amitii {
public static void main(String[] args) {
	String input="H4G6J5";
	StringBuilder output=new StringBuilder();
	for(int i=0;i<input.length();i++){
		char c=input.charAt(i);
		if(Character.isDigit(c)){
			int repeat=Character.getNumericValue(c);
			if(repeat%2==0){
				char prevChar=input.charAt(i-1);
				for (int j = 1; j < repeat/2; j++) {
					output.append(prevChar);
					
				}
			}
		}
		else{
			output.append(c);
		}
	}
	System.out.println(output.toString());
}
}
