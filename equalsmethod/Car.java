package equalsmethod;

public class Car {
	String car_nam;
	int car_cost;
	String car_type;
	Car(String car_nam,int car_cost,String car_type){
		this.car_nam=car_nam;
		this.car_cost=car_cost;
		this.car_type=car_type;
	}
	public boolean equals(Object obj)
	{
		Car c2=(Car)obj;
		return ((this.car_nam==c2.car_nam)&&(this.car_cost==c2.car_cost)&&(this.car_type==c2.car_type));
		
	}
	public static void main(String[] args) {
		Car c1=new Car("Audi",100000,"petrol");
		Car c2=new Car("Audi",100000,"petrol");
		boolean b=c1.equals(c2);
		System.out.println(b);
		
	}

}
