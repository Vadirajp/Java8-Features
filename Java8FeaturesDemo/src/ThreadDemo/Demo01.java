package ThreadDemo;

public class Demo01 {

	class T1 implements Runnable{
		@Override
		public void run() {
			System.out.println("T1");		
			System.out.println("T11");	
			System.out.println("T111");		
		}	
	}
	
	class T2 implements Runnable {
		@Override
		public void run() {
			System.out.println("T2");
			System.out.println("T22");
			System.out.println("T222");
		}
	}
	
	class T3 implements Runnable {
		@Override
		public void run() {
			System.out.println("T3");
			System.out.println("T33");
			System.out.println("T33");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Demo01 obj = new Demo01();
		T1 t1 =  obj.new T1();
		T2 t2 =  obj.new T2();
		T3 t3 =  obj.new T3();
		
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		Thread th3 = new Thread(t3);
		
		th1.start();
		th2.start();
		th3.start();
		
		th1.join();
	    th2.join();
	    th3.join();
		
		//if(th1.isAlive() && th2.isAlive() && th3.isAlive())
			System.out.println("... Multithreading is over ");
	}
	

}
