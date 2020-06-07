package java15_thread;

import java.util.Random;

public class Ex04_Join extends Thread{
	// �ϳ��� Ŭ���� �ȿ� �ΰ��� ������ �ۼ� ����
	
	private int idx; // �������� �ε���
	
	public Ex04_Join(int idx) {
		this.idx = idx;
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println( idx + " ������ ����");
		
		Random ran = new Random();
		
		try {
			// 0~3000�и��� ������ ������ sleep 
			Thread.sleep(ran.nextInt(3000));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println( idx + " ������ ��");
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main ������ ����");
		
		Ex04_Join t1 = new Ex04_Join(1);
		Ex04_Join t2 = new Ex04_Join(2);
		Ex04_Join t3 = new Ex04_Join(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		// ������ ����, ������ �ڽ��� �����Ų �����带 ��ٸ���
		try {
			// public final void join throws InterruptedException
			//	�����尡 ����� ������ ��ٸ���
			
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main ������ ��");
		
	}

}
