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
		//	���ڽ�Ʈ��(BufferReader, PrintWriter) ����
		
		// Source.txt ���� ũ�� = 42508 Byte
		
		File source = new File("./src/java13_io/charStream/", "Source.txt");
		File dest = new File("./src/java13_io/charStream/", "dest.txt");
		
		// ���� ����� ��Ʈ��
		BufferedReader in = null;
		PrintWriter out = null;
		
		// ����� ���� ����
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
				total += str.length(); // ���ڼ��� Ȯ��
			} // -> �̷��� �ϸ� �������� ���๮�ڰ� �߰��Ǿ� ����ȴ�
			
			
//			while( (len = in.read(cbuf)) != -1 ) {
//				out.write(cbuf, 0, len);
//				total += len;
//			}
			
			System.out.println("�� " + total + "���� ���� ����");
			
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
