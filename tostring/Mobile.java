package tostring;

public class Mobile {
	String mob_name;
	int mob_cost;
	String mob_col;
	Mobile(String mob_name,int mob_cost,String mob_col){
		this.mob_name=mob_name;
		this.mob_cost=mob_cost;
		this.mob_col=mob_col;
	}
	public String toString() {
		return "the mobile name is "+this.mob_name+
				"\n cost is "+this.mob_cost+
				"\n colour is "+this.mob_col+
				"\n**************************";
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile("VIVO",14000,"GOLDEN");
		Mobile m2=new Mobile("SAMSUNG",10000,"BLACK");
		System.out.println(m1);
		System.out.println(m2);
	}

}
