package java15_thread.sync;

public class WaitNotifyEx {
	public static void main(String[] args) { // 스레드와 데이터의 관리자
		
		SyncData data = new SyncData(); // 공유자원
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
	}

}
