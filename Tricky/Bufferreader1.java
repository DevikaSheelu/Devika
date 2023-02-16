package Tricky;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bufferreader1 {
  public static void main(String[] args) throws Exception {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	String input_from_question=bf.readLine();
	String ch[]=input_from_question.split(" ");
	int a=Integer.parseInt(ch[0]);
	int b=Integer.parseInt(ch[0]);
	while(a>10){
		a=a/10;
	}if(a==1){
		a=50*b;
		int input_from_questionn=a;
		
	}
	else if(a==2){
		a=100*b;
		double c=a*10/100;
		double e=a-c;
		int input_from_questionn=(int)e;
		
	}
	System.out.println(input_from_question);
	
	
}
}
