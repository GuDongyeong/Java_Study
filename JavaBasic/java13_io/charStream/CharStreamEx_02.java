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
		
		// ���� �Է¹��� ���� BufferedReader�̿��ϱ�
		
		// ǥ���Է� ��Ʈ�� System.in -> Reader
		BufferedReader reader = new BufferedReader(new InputStreamReader( System.in ));
		
		// ǥ����� ��Ʈ�� System.out -> Writer
		BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( System.out ));

		String str = null; // �Է¹��� ���ڿ�
		
		try {
			while( (str = reader.readLine()) != null) {
				writer.write(str); // ���ڿ� ���
				writer.newLine(); // ����
				
				writer.flush(); // ���� ����
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
