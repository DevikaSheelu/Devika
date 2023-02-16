package Filetopic;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filered {
	public static void main(String[] args)throws IOException {
		File f1=new File("C:\\Users\\Devika\\Desktop\\devika\\wow.txt");
		FileReader fr=new FileReader(f1);
		char[] arr=new char[(int)f1.length()];
		System.out.println(fr.read(arr));
		
		
	}

}
