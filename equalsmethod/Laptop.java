package equalsmethod;

public class Laptop {
	String lap_name;
	int lap_cost;
	String lap_brand;
	Laptop(String lap_name,int lap_cost,String lap_brand){
		this.lap_name=lap_name;
		this.lap_cost=lap_cost;
		this.lap_brand=lap_brand;
	}
	public boolean equals(Object obj){
		Laptop p2=(Laptop)obj;
		return ((this.lap_name==p2.lap_name)&&(this.lap_brand==p2.lap_brand));
		}
	public static void main(String[] args) {
		Laptop l1=new Laptop("abc",45000,"DELL");
		Laptop l2=new Laptop("abcd",45000,"DELL");
		if(l1.equals(l2))
		{
			System.out.println("same");
		}
		else{
			System.out.println("not same");
		}
	}

}
