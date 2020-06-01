package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferInputStream {
	public static void main(String[] args) {
		
		// �Է´�� ���� ��ü
		File file = new File( "./src/java13_io/", "Source.txt");
		System.out.println("[TEST] file : " + file.exists());
		
		
		// ���� �Է� ��Ʈ�� ��ü
		FileInputStream fis = null; //1�� ��Ʈ��
		BufferedInputStream bis = null; // 2�� ��Ʈ��, ���� ��� ���� ��Ʈ��
		
		// ���� �Է� ���� ���� ����
		byte[] buf = new byte[1024]; //�Է� ������ �ӽ� �����
		int len = 0; // �Է� �������� ����
		
		
		try {
			fis = new FileInputStream(file); // File -> FileInputStream
			bis = new BufferedInputStream(fis); // �Ű����� InputStream, 1�� ��Ʈ���� �����ϱ� ���� 
			// FileInputStream -> BufferedInputStream
			
			// File -> FileInputStream -> BufferedInputStream
//			bis = new BufferedInputStream( new FileInputStream(file) ); // �ѹ��� ����� ��
			
			while( (len = bis.read(buf)) != -1) {
//				System.out.println( new String(buf, 0, len) );
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ��Ʈ�� �ݱ�, ������ �������� ���� - fis�� ���� ������ bis�� fis�� �����ϱ� ������ ������ ����
				if( bis != null )	bis.close();
//				if( fis != null )	fis.close(); // ���۽�Ʈ��.close() �� 1�� ��Ʈ���� �Բ� �ݾ���
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
