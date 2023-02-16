package equalsmethod;

public class Home {
	String home_nam;
	int home_cost;
	String home_col;
	Home(String home_nam,int home_cost,String home_col){
		this.home_nam=home_nam;
		this.home_cost=home_cost;
		this.home_col=home_col;
	}
	public boolean equals(Object obj)
	{
		Home c2=(Home)obj;
		return ((this.home_nam==c2.home_nam)&&(this.home_cost==c2.home_cost)&&(this.home_col==c2.home_col));
		
	}
	public static void main(String[] args) {
		Home c1=new Home("MALLIKARJUN",100000,"petrol");
		Home c2=new Home("SHARANU",100000,"petrol");
		boolean b=c1.equals(c2);
		System.out.println(b);
		
	}

}

