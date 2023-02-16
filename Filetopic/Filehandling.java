package Filetopic;
import java.io.FileWriter;

import java.io.File;
import java.io.IOException;

public class Filehandling {
	public static void main(String[] args) throws IOException{
		File f1=new File("C:\\Users\\Devika\\Desktop\\devika\\wow.txt");
	    FileWriter fw=new FileWriter(f1);
	    fw.write("hi hello");
	    
	    
	    fw.flush();
	    System.out.println("Data is written");
	    
	}
}

