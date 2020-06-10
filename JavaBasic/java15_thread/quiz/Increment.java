package java15_thread.quiz;

public class Increment implements Runnable {
//	private int start = 1;
	private int num;
	
	public Increment(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {

		System.out.println("inc Thread Start");
		for(int i=1;i<=num;i+=2) {
			
			System.out.println("Increment : " + i);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
//		while( start < num ) {
//			System.out.println("Increment : " + (start+=2));
//		}
		
		
		System.out.println("inc Thread End");
		
	}

}
