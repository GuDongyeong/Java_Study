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
		
		// ǥ���Է� ��Ʈ�� System.in -> Reader
		BufferedReader in = new BufferedReader(new InputStreamReader( System.in ));
		
		// ǥ����� ��Ʈ�� System.out -> PrintWriter
		PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter(System.out)), true); // true autoFlush
//		PrintWriter out = new PrintWriter( new BufferedOutputStream(System.out), true); // PrintWriter�� ����Ʈ���� ���ڷ� �ڵ� ��ȯ����
		// ��� System.out��ü�� ����Ʈ��Ʈ��, new ���� �ʿ� ����
		
		String str = null; // �Է¹��� ���ڿ�
		
		try {
			while ((str = in.readLine()) != null) {
				out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ��Ʈ�� �ݱ�
			if( out != null)	out.close(); // PrintWriter�� try catch�� �ʿ����. ���� ó��������
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
