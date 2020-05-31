package java13_io.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {
		
		
		
		// �Է´�� ����
		File file = new File("./src/java13_io/file/", "Hello");
		System.out.println("[TEST] exists : " + file.exists());
		
		FileInputStream fis = null; //���� �Է½�Ʈ�� ��ü
		
		// ���� �Է� ���� ����
		
		int in = -1; // �Էµ�����
		int len = 0; // �Է� ���� ����
		
		StringBuilder sb = new StringBuilder(); //�Է��� ������ �����
		
		try {
			fis = new FileInputStream(file); // �����Է� ��Ʈ�� ����
			
			while( (in = fis.read()) != -1) {
				sb.append( (char)in ); //�Էµ� ������ ����
				len++; //�Է��� ���� ���
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
		
		System.out.println("[�Է¹��� ����] " + len);
		System.out.println(sb);
		
				
	}

}
