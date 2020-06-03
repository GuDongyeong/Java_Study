package java13_io.filterstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		// ��� ��� ���� ��ü
		File file = new File( "./src/java13_io/filterStream/", "BufferedOut.txt");
		
		// ���� ��½�Ʈ�� ��ü
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
				
		try {
			// ���� ��� ��Ʈ�� ����
			fos = new FileOutputStream(file, true); // �߰����
			bos = new BufferedOutputStream(fos);
			
			bos.write("Orange".getBytes());
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ��Ʈ�� �ݱ�
				if( bos != null ) bos.close();
				if( fos != null ) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
