package Collections;

import java.util.LinkedList;

public class Linkedlist1 {
 public static void main(String[] args) {
	LinkedList ls=new LinkedList<>();
	ls.add(20);
	ls.add("hi");
	ls.add(40);
	ls.add(5.20);
	ls.add(20);
	ls.add("hello");
	ls.add(90);
	//ls.remove(5.20);
	
	System.out.println(ls);
	ls.add(4,234);
	System.out.println(ls);
	
}
}
