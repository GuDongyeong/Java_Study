package java15_thread.sync;

public class Output extends Thread {
	SyncData data;
	
	public Output(SyncData data) {
		this.data = data;	
	}
	
	@Override
	public void run() {
		System.out.println("--- Output Start ---");
		
		synchronized (data) {
			
			// ������ �Ϸ���� ���� ��Ȳ
			if( !data.availabe ) {
				try {
					data.wait(); // �����尡 data�� ��ٸ��٤� LOCK�ݳ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
			System.out.println("TOTAL : " + data.total );
			
		}
		
		
		System.out.println("--- Output End ---");
	}

}
