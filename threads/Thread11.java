package threads;

public class Thread11 {
  public static void main(String[] args) {
	  Sample s1=new Sample();
	  Thread th1=new Thread(s1);
	  th1.start();
	  Demo d1=new Demo();
	  Thread th2=new Thread(d1);
	  th2.start();
	
}
}
class Sample extends Thread{
	synchronized public void run(){
		for (int i = 1; i < 11; i++) {
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
class Demo implements Runnable{
	synchronized public void run(){
		for (int i = 11; i < 21; i++) {
			System.out.println(i);
			try{
				Thread.sleep(1001);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
