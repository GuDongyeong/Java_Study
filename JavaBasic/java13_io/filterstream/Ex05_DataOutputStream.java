package java13_io.filterstream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_DataOutputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체 생성
		File file = new File("./src/java13_io/filterstream", "DataTest.txt");
		
		// 데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			// 데이터 출력 스트림 생성
			dos = new DataOutputStream( new BufferedOutputStream( new FileOutputStream(file)));
			
			dos.write(100); // 아스키코드
			
			dos.writeBoolean(true); // 1B
			dos.writeChar('A'); // 2B
			dos.writeInt(88); // 4B
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( dos != null )	dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
