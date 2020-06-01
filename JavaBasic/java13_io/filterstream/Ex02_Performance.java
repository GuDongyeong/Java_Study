package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		// 성능 평가, Performance Evaluation
		//	알고리즘 시작 전 현재시간 체크 -> start
		//	알고리즘 시작 후 현재시간 체크 -> end
		//	둘의 차이를 구한다 -> 알고리즘 수행시간 : end - start
		
		// 입력대상 파일 객체
		File file = new File( "./src/java13_io/", "Source.txt");
		System.out.println("[TEST] file : " + file.exists());
		
		long start = System.currentTimeMillis(); // 현재 시간을 밀리초로 변환
		// 여기에 수행시간을 측정할 알고리즘을 작성함
		
		long end = System.currentTimeMillis(); // 현재 시간을 밀리초로 변환
		
		System.out.println( end - start );
		System.out.println((end-start)/(double)1000); // 초 단위로 확인
		
		// 파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; // 2차 스트림, 성능 향상 보조 스트림
		
		// 파일 입력 관련 보조 변수
		byte[] buf = new byte[1024]; //입력 데이터 임시 저장소 // 프로그래밍 보조
		int len = 0; // 입력 데이터의 길이
		
		
		try {
			
			fis = new FileInputStream(file); // File -> FileInputStream
			bis = new BufferedInputStream(fis); // 매개변수 InputStream, 1차 스트림을 보조하기 위해 
			// FileInputStream -> BufferedInputStream
			
			
			start = System.currentTimeMillis();
			while( (len = bis.read(buf)) != -1) {}
			end = System.currentTimeMillis();
			System.out.println((end-start)/(double)1000); // 초 단위로 확인
			
			
			System.out.println("-------------------------");
			
			fis = new FileInputStream(file); // File -> FileInputStream
			bis = new BufferedInputStream(fis); // 매개변수 InputStream, 1차 스트림을 보조하기 위해 
			// FileInputStream -> BufferedInputStream
		
			start = System.currentTimeMillis();
			while( (len = fis.read(buf)) != -1) {}
			end = System.currentTimeMillis();
			System.out.println((end-start)/(double)1000); // 초 단위로 확인
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림 닫기, 생성한 역순으로 스택 - fis를 먼저 닫으면 bis는 fis에 의존하기 때문에 갈길을 잃음
				if( bis != null )	bis.close();
//				if( fis != null )	fis.close(); // 버퍼스트림.close() 은 1차 스트림도 함께 닫아줌
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
