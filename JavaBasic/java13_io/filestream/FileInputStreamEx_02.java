package java13_io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_02 {
	public static void main(String[] args) {
		
		//����Ʈ �迭�� ���� �Է� ó��
		
		File file = new File("./src/java13_io/file", "Source.txt");
		
		System.out.println( "[TEST] exists : " + file.exists());
		
		int len = -1; // �Է��� ����
		byte[] buf = new byte[1024]; // �Է� ������ �ӽ� �����
		int total = 0; // �� �Է� ����
		
		StringBuilder sb = new StringBuilder(); // �Է� ������ �����
		
		FileInputStream fis = null; // ���� �Է� ��Ʈ��
		
		
		
		
		try {
			fis = new FileInputStream(file); // ���� �Է� ��Ʈ�� ����
			
			while( (len = fis.read(buf)) != -1) { // ���� �Է�
				
				sb.append( new String(buf, 0, len)); // ����ҿ� ������ ����
				
				total += len; //�� ���� ���
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if( fis != null)	fis.close(); // ��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�Է¹��� ���� : " + total + "B");
//		System.out.println( sb );
		
		
	}

}
