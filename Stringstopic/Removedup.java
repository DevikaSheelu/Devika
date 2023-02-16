package Stringstopic;

public class Removedup {
	public static void main(String[] args) {
		String input="ababcac";
		String output="";
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j <input.length(); j++) {
				if(input.charAt(i)!=output.charAt(j)){
					output=output+input.charAt(j);
				}
				
			}
		}
		System.out.println(output);
	}

}
