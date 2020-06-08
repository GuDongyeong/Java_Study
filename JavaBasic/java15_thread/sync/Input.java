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
			
			data.availabe = true; // ������ �Է�(����) �Ϸ� ����
			
//			data.notify(); // LOCK ���� ����
			data.notifyAll(); // LOCK ���� ����
		}
		
		System.out.println("--- Input End ---");
	}

}
