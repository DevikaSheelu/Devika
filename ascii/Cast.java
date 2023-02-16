package ascii;
import java.util.Arrays;

public class Cast {
	public static void main(String[] args) {
		String str="devika";
		char[] ch=str.toCharArray();
		int res=0;
		for (int i = 0; i < ch.length; i++) {
			int cast=(int)str.charAt(i);
			res=res+cast;
			
			
		}
		System.out.println(res);
		
	}

}
