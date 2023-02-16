package abstraction;
abstract interface Car1{
	public abstract void engine();
	public abstract void wheel();
}
class Car2 implements Car1{
	public void engine(){
		System.out.println("engine implement done");
	}
	public void wheel(){
		System.out.println("wheels also done");
	}
}
class manufacture{
	public static void product(Car1 c){
		c.engine();
		c.wheel();
	}
}
public class Car {
	public static void main(String[] args) {
	Car2 c1=new Car2();
	manufacture.product(c1);
	}
}
