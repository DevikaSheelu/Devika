package Array;

public class Hash {
	public static void main(String[] args) {
		String str="#J#a#v#a";
		String str1="";
		String str2="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='#') {
				str1=str1+str.charAt(i);
			} else {
				str2=str2+str.charAt(i);

			}
			
		}
		System.out.println(str1+""+str2);
				
	}

}
