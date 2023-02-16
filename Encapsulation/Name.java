package Encapsulation;
class Empname{
	private String name="Priyanka";
	public String getpwd(){
		return name;
	}
	public void setpwd(String name){
		this.name=name;
	}
}
public class Name {
	public static void main(String[] args) {
	Empname e1=new Empname();
	System.out.println(e1.getpwd( ));
	e1.setpwd("Ranjita");
	System.out.println(e1.getpwd());
	}
}
