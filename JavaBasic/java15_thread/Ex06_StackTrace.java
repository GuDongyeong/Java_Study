package java15_thread;

class Thread06 extends Thread{
	
	@Override
	public void run() {
		method01();
	}
	
	private void method01() {
		method02();
	}
	
	private void method02() {
		method03();
	}

	private void method03() {
		try {
			throw new Exception();
		} catch( Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class Ex06_StackTrace {
	public static void main(String[] args) {
		
		// �������� ���� Ʈ���̽� Ȯ���ϱ�
		
		new Thread06().start(); // ������ Ȱ��ȭ
		
		new Thread06().run(); // Main �����带 �̿��� run() �޼ҵ� ȣ��
		
	}
}
