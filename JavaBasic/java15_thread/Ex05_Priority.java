package java15_thread;

public class Ex05_Priority extends Thread {// priority == �켱����
	
	private int idx; // ������ �ε���
	
	public Ex05_Priority(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		
		System.out.println( idx + " ������ ����");
		
		for(int i=0;i<1000;i++) {
			System.out.print(idx);
		}
		
		System.out.println( idx + " ������ ��");
	}
	

	public static void main(String[] args) { 
		
		System.out.println("Main ������ ����");
		
		Ex05_Priority t1 = new Ex05_Priority(1);
		Ex05_Priority t2 = new Ex05_Priority(2);
		Ex05_Priority t3 = new Ex05_Priority(3);
		
		// �켱���� ����
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.NORM_PRIORITY); //5
		t3.setPriority(Thread.MAX_PRIORITY); //10 - ���� Ŭ���� �켱������ ����
		
		// ������ Ȱ��ȭ
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ������ ��");
	}

	// Thread Scheduling, ������ �����ٸ�
	//	������ ����� �������� ������ ���� ����, �˰��� ����
	//	Round Robin, ��ȯ�Ҵ� : time slice ��ŭ �����ư��� �����Ѵ�, ���ư��鼭 ���ݾ� ó��
	//		time slice, �ð�����
	//
	//		priority, �켱���� : �켱������ ���� �����带 �� �� ���� �����Ѵ�
	//			�����带 �����Ҷ� ������ �켱 ������ ���ΰ�
	//			time slice�� ���� ����, �� ���� ���
	//
	//	�ڹٴ� Round Robin, Priority �� �˰����� �����Ͽ� ������ �����ٸ��� �����Ѵ�
	
}
