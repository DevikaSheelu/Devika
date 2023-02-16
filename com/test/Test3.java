package com.test;

public class Test3 {
public static void main(String[] args) {
	Animal a=new Cat();
	a.printName();
}
}
package.com.test.exam;
class Animal{
	public void printName(){
		System.out.println("animal");
	}
}
package com.test;
class Cat extends Animal{
	public void printName(){
		System.out.println("cat");
	}
}

