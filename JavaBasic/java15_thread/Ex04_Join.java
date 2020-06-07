package java15_thread;

import java.util.Random;

public class Ex04_Join extends Thread{
	// 하나의 클래스 안에 두개의 스레드 작성 가능
	
	private int idx; // 스레드의 인덱스
	
	public Ex04_Join(int idx) {
		this.idx = idx;
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println( idx + " 스레드 시작");
		
		Random ran = new Random();
		
		try {
			// 0~3000밀리초 사이의 랜덤한 sleep 
			Thread.sleep(ran.nextInt(3000));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println( idx + " 스레드 끝");
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main 스레드 시작");
		
		Ex04_Join t1 = new Ex04_Join(1);
		Ex04_Join t2 = new Ex04_Join(2);
		Ex04_Join t3 = new Ex04_Join(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		// 스레드 제어, 메인이 자신이 실행시킨 스레드를 기다린다
		try {
			// public final void join throws InterruptedException
			//	스레드가 종료될 때까지 기다린다
			
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 끝");
		
	}

}
