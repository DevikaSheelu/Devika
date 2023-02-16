package equalsmethod;

public class Mobile {
	String mob_name;
	String mob_col;
	int mob_cost;
	Mobile(String mob_name,String mob_col,int mob_cost)
	{
		this.mob_name=mob_name;
		this.mob_col=mob_col;
		this.mob_cost=mob_cost;
	}
	public boolean equals(Object obj)
	{
		Mobile m2=(Mobile)obj;
		return ((this.mob_name==m2.mob_name)&&(this.mob_col==m2.mob_col)&&(this.mob_cost==m2.mob_cost));
		
	}
	public static void main(String[] args) {
		Mobile m1=new Mobile("VIVO","golden",14000);
		Mobile m2=new Mobile("VIVO","golden",14000);
		if(m1.equals(m2))
		{
			System.out.println("all are same");
		}
		else{
			System.out.println("not same");
		}
	}

}
