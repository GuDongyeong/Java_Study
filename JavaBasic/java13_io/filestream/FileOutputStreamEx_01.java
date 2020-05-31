package java13_io.filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		// ��� ��� ����
		
		File file = new File( "./src/java13_io/fileStream/", "Result");
		System.out.println("[TEST] exists : " + file.exists());
		
		FileOutputStream fos = null; // ���� ��� ��Ʈ�� ��ü
		
		try {
//			fos = new FileOutputStream(file); // ������� ��Ʈ�� ����
//			fos = new FileOutputStream(file, false); // ���� ���, ���� �Ͱ� ����
			fos = new FileOutputStream(file, true); // �߰� ���
			
			//���� ��� ���
			//	������ - �ι�° ���ڸ� false, ������ ó������ ���Ӱ� ���
			//	�߰���� - �ι�° ���ڸ� true, ������ ���� �߰� ���
			
			
			String str = "HELLO FileStream\n";
			fos.write(str.getBytes(), 0, str.length()); // ���� ���
			fos.flush();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( fos != null )	fos.close(); // ��Ʈ�� �ݱ�
			} catch( IOException e){
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
