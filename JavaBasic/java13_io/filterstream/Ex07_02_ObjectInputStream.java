package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex07_02_ObjectInputStream {
	public static void main(String[] args) {
		
		// 파일 객체 선언
		File file = new File("./src/java13_io/filterstream/", "ObjectTest.ser"); 
		
		// 스트림 입력 객체
		ObjectInputStream ois = null;
		
		try {
			// 스트림 객체 생성
			ois = new ObjectInputStream( new BufferedInputStream( new FileInputStream(file)));
			
			// 파일 읽기
			Point obj1 = (Point)ois.readObject();
			Point obj2 = (Point)ois.readObject();
			Point obj3 = (Point)ois.readObject();
			
			System.out.println( obj1 );
			System.out.println( obj2 );
			System.out.println( obj3 );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if( ois != null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
				
	}

}
