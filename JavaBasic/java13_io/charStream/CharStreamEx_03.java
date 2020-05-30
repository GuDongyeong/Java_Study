package java13_io.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_03 {
	public static void main(String[] args) {
		
		// 표준입력 스트림 System.in -> Reader
		BufferedReader in = new BufferedReader(new InputStreamReader( System.in ));
		
		// 표준출력 스트림 System.out -> PrintWriter
		PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter(System.out)), true); // true autoFlush
//		PrintWriter out = new PrintWriter( new BufferedOutputStream(System.out), true); // PrintWriter가 바이트에서 문자로 자동 변환해줌
		// 사실 System.out자체가 프린트스트림, new 해줄 필요 없음
		
		String str = null; // 입력받은 문자열
		
		try {
			while ((str = in.readLine()) != null) {
				out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 스트림 닫기
			if( out != null)	out.close(); // PrintWriter는 try catch할 필요없다. 예외 처리돼있음
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
