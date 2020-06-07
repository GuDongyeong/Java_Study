package java15_thread;

// �Ϲ� Ŭ���� -> Thread Ŭ���� ���, ������ Ŭ����
class Thread01 extends Thread {
	
	@Override
	public void run() { // ������ �ڵ�
		
		for(int i=1; i<=100; i++) {
			System.out.println("Tread : " + i);
			
			try {
				Thread.sleep(50); // �����带 50�и��� �Ͻ����� ��Ų��
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
	}
}

public class Ex01_classThread {
	public static void main(String[] args) { // �⺻ ������
		
		Thread01 th01 = new Thread01(); // thread Ŭ���� ��ü ����
		
//		th01.run(); // �Ϲ� �޼ҵ� ȣ��, ������ ��, ��Ƽ�����尡 �ƴ�
		
		th01.start(); // ������ ����, Ȱ��ȭ
		
		for(int i=1; i<=100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(50); // �����带 50�и��� �Ͻ����� ��Ų��
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ������ ���� �޼ҵ�
//	
//	  - �������� ������ �����ϴ� �޼ҵ�
//
//	  - ������ �����ֱ�(������ ����Ŭ, life cycle)�� ������ �ش�
//
//	 public static void sleep(long millis) throws InterruptedException
//		�־��� �и��ʸ�ŭ sleep�� ȣ���� �����带 �Ͻ�������Ų��
	
}
