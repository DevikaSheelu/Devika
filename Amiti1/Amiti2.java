package Amiti1;

public class Amiti2 {
	public static void main(String[] args) {
		String str="A2B3D8";
		int i=0;
		while(i<str.length()){
			char ch=str.charAt(i);
			i++;
			int num=0;
			while(i<str.length()&&Character.isDigit(str.charAt(i))){
				num=num*10+Character.getNumericValue(str.charAt(i));
				i++;
			}
			if(num==0){
				result.append(letter);
				else if(num%2==0){
					for (int j = 0; j < num/2; j++) {
						result.append(letter);
					}
				}
				else{
					result.append(letter);
				}
			}
			return result.toString();
			
		}
	}

}
