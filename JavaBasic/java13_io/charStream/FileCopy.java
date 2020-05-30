package java13_io.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) {
		// Source.txt = Dest.txt
		//	문자스트림(BufferReader, PrintWriter) 복사
		
		// Source.txt 파일 크기 = 42508 Byte
		
		File source = new File("./src/java13_io/charStream/", "Source.txt");
		File dest = new File("./src/java13_io/charStream/", "dest.txt");
		
		// 문자 입출력 스트림
		BufferedReader in = null;
		PrintWriter out = null;
		
		// 입출력 보조 변수
		String str = null;
//		char[] cbuf = new char[1024];
		int len = -1;
		int total = 0;
		
		try {
			
//			in = new BufferedReader( new FileReader("./src/java13_io/charStream/Source.txt"));
//			out = new PrintWriter( new BufferedWriter((new FileWriter("./src/java13_io/charStream/dest.txt"))), true);
			
			
			in = new BufferedReader( new FileReader(source));
			out = new PrintWriter( new BufferedWriter((new FileWriter(dest))), true);
			
			while( ( str = in.readLine()) != null ) {
				out.println(str);
				total += str.length(); // 문자수만 확인
			} // -> 이렇게 하면 마지막에 개행문자가 추가되어 복사된다
			
			
//			while( (len = in.read(cbuf)) != -1 ) {
//				out.write(cbuf, 0, len);
//				total += len;
//			}
			
			System.out.println("총 " + total + "개의 문자 복사");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if( out != null )	out.close();
			try {
				if( in != null )	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
