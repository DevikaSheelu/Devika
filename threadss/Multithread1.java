package threadss;


class Sample extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}
class Demo extends Thread{
	public void run(){
		for (int i = 11; i <=20; i++) {
			System.out.println(i);
				Thread.sleep(2000);
			
		}
	}
}
public class Multithread1 {
public static void main(String[] args) {
	Sample sample=new Sample();
	Thread thread=new Thread(sample);
	thread.start();
	Demo demo=new Demo();
	Thread thread2=new Thread(demo);
	thread2.start();
}
}
