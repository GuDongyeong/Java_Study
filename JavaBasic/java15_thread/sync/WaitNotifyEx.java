package java15_thread.sync;

public class WaitNotifyEx {
	public static void main(String[] args) { // ������� �������� ������
		
		SyncData data = new SyncData(); // �����ڿ�
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
	}

}
