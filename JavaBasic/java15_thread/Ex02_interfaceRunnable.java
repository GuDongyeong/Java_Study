package java15_thread;

// Runnable 클래스
class Thread02 implements Runnable{ // 러너블 클래스로 이용, 쓰레드 클래스는 다른 기능을 상속받을 수 없기때문에
	
	@Override
	public void run() {
		
		for(int i=1; i<=100; i++) {
			System.out.println("Tread : " + i);
			
			try {
				Thread.sleep(50); // 스레드를 50밀리초 일시정지 시킨다
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Ex02_interfaceRunnable {
	public static void main(String[] args) {
		
		Thread02 th02 = new Thread02(); // 생명주기상 new
		
		// Thread클래스에 Runnable클래스를 전달하여 객체를 생성한다
		Thread threadEcutor = new Thread( th02 );
		
		threadEcutor.start(); // 스레드 실행, 활성화
		
		
		for(int i=1; i<=100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(50); // 스레드를 50밀리초 일시정지 시킨다
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		
		
	}

}
