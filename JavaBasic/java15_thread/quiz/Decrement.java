package java15_thread.quiz;

public class Decrement implements Runnable {
	
	private int n1;
	private int n2;
	
	public Decrement(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	@Override
	public void run() {

		System.out.println("\tDec Thread Start");
		for(int i=Math.max(n1, n2);i>=Math.min(n1, n2);i--) {
			System.out.println("\tDecrement : " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		while( n2 >= n1) {
//			System.out.println("Decrement : " + n2--);
//		}
		
		System.out.println("\tDec Thread End");
	}

}
