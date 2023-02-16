package Encapsulation;
class Empid{
	private int pwd=123;
	public int getpwd(){
		return pwd;
	}
	public void setpwd(int pwd){
		this.pwd=pwd;
	}
}

public class Employee {
		public static void main(String[] args) {
			Empid e1=new Empid();
			System.out.println(e1.getpwd());
			e1.setpwd(456);
			System.out.println("new password:"+e1.getpwd());
			}
}
