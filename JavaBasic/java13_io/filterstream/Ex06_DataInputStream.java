package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06_DataInputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체 생성
		File file = new File("./src/java13_io/filterstream", "DataTest.txt");
		
		// 데이터 입력 스트림 생성
		DataInputStream dis = null;
		
		try {
			// 데이터 입력 스트림 생성
			dis = new DataInputStream( new BufferedInputStream( new FileInputStream(file)));
			
			int d1 = dis.read();
			boolean d2 = dis.readBoolean();
			char d3 = dis.readChar();
			int d4 = dis.readInt();
			// 출력했던 순서를 맞추어서 그대로 입력

			System.out.println("d1 : " + (char)d1);
			System.out.println("d2 : " + d2);
			System.out.println("d3 : " + d3);
			System.out.println("d4 : " + d4);
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( dis != null ) dis.close(); // 스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
