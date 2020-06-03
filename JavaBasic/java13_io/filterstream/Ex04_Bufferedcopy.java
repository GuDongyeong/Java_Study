package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_Bufferedcopy {
	public static void main(String[] args) {
		
		// BufferedStream을 이용한 파일 복사
		//	Source.txt -> Dest.txt 복사
		
		//	Source.txt : ./src/java13_io/
		//	Dest.txt : ./java13_io/filterStream/
		
		// 파일 복사 완료 후 몇 바이트 복사했는지 출력하기
		
		// 성능 평가
		long start = 0;
		long end = 0;
		
		
		// 파일 객체 생성
		File source = new File( "./src/java13_io/", "Source.txt");
		File dest = new File("./src/java13_io/filterStream/", "Dest.txt");
		
		// 파일 스트림 객체 선언
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		// 입출력 보조 변수
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;
		
		// 파일 복사
		try {
			
			// 입출력 스트림 생성
			fis = new FileInputStream(source);
			bis = new BufferedInputStream(fis);
			
//			bis = new BufferedInputStream( new FileInputStream(source));
			
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
//			bos = new BufferedOutputStream( new FileOutputStream(dest) );
			
			start = System.currentTimeMillis();
			
			while( (len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len); // 파일 출력
				total += len; // 총 길이 계산하기
			}
				bos.flush(); // 버퍼 비우기, 자동으로 계속 버리지 않고 한번에 버리기
			
			end = System.currentTimeMillis();
			
		} catch( FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( bos != null)	bos.close();
				if( fos != null)	fos.close();
				
				if( bis != null)	bis.close();
				if( fis != null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("총 " + total + "Byte 복사 완료");
		System.out.println( end-start/(double)1000);
		
		
		
	}

}
