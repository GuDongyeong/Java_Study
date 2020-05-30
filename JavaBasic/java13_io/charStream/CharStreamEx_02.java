package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		// 문자 입력받을 때는 BufferedReader이용하기
		
		// 표준입력 스트림 System.in -> Reader
		BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));
		
		// 표준출력 스트림 System.out -> Writer
		BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( System.out ));

		String str = null; // 입력받은 문자열
		
		try {
			while( (str = reader.readLine()) != null) {
				writer.write(str); // 문자열 출력
				writer.newLine(); // 개행
				
				writer.flush(); // 버퍼 비우기
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( writer != null ) writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
