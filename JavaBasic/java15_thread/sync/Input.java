package java15_thread.sync;

public class Input extends Thread {
	SyncData data;
	
	public Input( SyncData data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		System.out.println("--- Input Start ---");
		
		synchronized (data) {
			
			for(int i=1; i<=100; i++) {
				data.total += i;
			}
			
			data.availabe = true; // 데이터 입력(덧셈) 완료 상태
			
//			data.notify(); // LOCK 상태 통지
			data.notifyAll(); // LOCK 상태 통지
		}
		
		System.out.println("--- Input End ---");
	}

}
