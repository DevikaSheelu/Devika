package equalsmethod;

public class Tv {
	int tv_cost;
	String tv_brand;
	String tv_type;
	Tv(String tv_brand,String tv_type,int tv_cost){
		this.tv_cost=tv_cost;
		this.tv_brand=tv_brand;
		this.tv_type=tv_type;
	}
	public boolean equals(Object obj){
		Tv t2=(Tv)obj;
		return ((this.tv_cost==t2.tv_cost)&&(this.tv_brand==t2.tv_brand)&&(this.tv_type==t2.tv_type));
	}
	public static void main(String[] args) {
		Tv t1=new Tv("DELL","LED",500000);
		Tv t2=new Tv("LENOVA","LCD",100000);
		boolean b=t1.equals(t2);
		System.out.println(b);
	}
	}

