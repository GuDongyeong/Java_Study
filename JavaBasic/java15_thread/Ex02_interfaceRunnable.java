package java15_thread;

// Runnable Ŭ����
class Thread02 implements Runnable{ // ���ʺ� Ŭ������ �̿�, ������ Ŭ������ �ٸ� ����� ��ӹ��� �� ���⶧����
	
	@Override
	public void run() {
		
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

public class Ex02_interfaceRunnable {
	public static void main(String[] args) {
		
		Thread02 th02 = new Thread02(); // �����ֱ�� new
		
		// ThreadŬ������ RunnableŬ������ �����Ͽ� ��ü�� �����Ѵ�
		Thread threadEcutor = new Thread( th02 );
		
		threadEcutor.start(); // ������ ����, Ȱ��ȭ
		
		
		for(int i=1; i<=100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(50); // �����带 50�и��� �Ͻ����� ��Ų��
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
		
	}

}
