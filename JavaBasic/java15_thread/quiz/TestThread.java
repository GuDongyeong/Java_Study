package java15_thread.quiz;

public class TestThread {
	public static void main(String[] args) {
		
		System.out.println("Main Thread Start");
		
		Increment inc = new Increment(50);
		Decrement dec = new Decrement(12, 45);
		
		Thread incT = new Thread(inc);
		Thread decT = new Thread(dec);
		
		incT.start();
		decT.start();
		
		try {
			incT.join();
			decT.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread End");
	}

}
