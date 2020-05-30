package java13_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {
		
		// ��Ʈ�� �⺻������ ����Ʈ ������ ����� �Ѵ�
		//	����Ʈ��Ʈ���� ���ڽ�Ʈ������ ��ȯ�� �ʿ䰡 �ִ�
		
		//	InputStreamReader
		//	OutputStreamWriter
		//	�� Ŭ������ �̿��Ͽ� ��ȯ�Ѵ�
		
		// ǥ���Է� ��Ʈ�� System.in -> Reader
		Reader reader = new InputStreamReader( System.in );
		
		// ǥ����� ��Ʈ�� System.out -> Writer
		Writer writer = new OutputStreamWriter( System.out );
		
		// ����� ���� ����
		char[] cbuf = new char[1024]; // �Է��� ������ �ӽ� �����
		int len = -1; // �Է��� �������� ���� ( ���� �� )
		int total = 0; // �Է��� �������� �� ����( ���� �� )
		
		try {
			// EOF�� �Էµ� ������ Ű������ �Է��� �޴´�
			while( (len = reader.read(cbuf)) != -1) { // Ű���� �Է�
				writer.write(cbuf, 0, len); // ����� ���
				writer.flush(); // ���� ����, �׶��׶� ����� ���	
				total += len; // �Է¹��� ���� �� ���
			}
			writer.flush(); // ���� ����, �ѹ��� ����� ���	
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( writer != null ) writer.close();
				if( reader != null ) reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println("������� ���ڴ� " + total + "�� �Դϴ�"); // System.out(writer)�� close�ؼ� �������� ����
	}

}