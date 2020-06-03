package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_Bufferedcopy {
	public static void main(String[] args) {
		
		// BufferedStream�� �̿��� ���� ����
		//	Source.txt -> Dest.txt ����
		
		//	Source.txt : ./src/java13_io/
		//	Dest.txt : ./java13_io/filterStream/
		
		// ���� ���� �Ϸ� �� �� ����Ʈ �����ߴ��� ����ϱ�
		
		// ���� ��
		long start = 0;
		long end = 0;
		
		
		// ���� ��ü ����
		File source = new File( "./src/java13_io/", "Source.txt");
		File dest = new File("./src/java13_io/filterStream/", "Dest.txt");
		
		// ���� ��Ʈ�� ��ü ����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		// ����� ���� ����
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;
		
		// ���� ����
		try {
			
			// ����� ��Ʈ�� ����
			fis = new FileInputStream(source);
			bis = new BufferedInputStream(fis);
			
//			bis = new BufferedInputStream( new FileInputStream(source));
			
			fos = new FileOutputStream(dest);
			bos = new BufferedOutputStream(fos);
			
//			bos = new BufferedOutputStream( new FileOutputStream(dest) );
			
			start = System.currentTimeMillis();
			
			while( (len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len); // ���� ���
				total += len; // �� ���� ����ϱ�
			}
				bos.flush(); // ���� ����, �ڵ����� ��� ������ �ʰ� �ѹ��� ������
			
			end = System.currentTimeMillis();
			
		} catch( FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( bos != null)	bos.close();
				if( fos != null)	fos.close();
				
				if( bis != null)	bis.close();
				if( fis != null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�� " + total + "Byte ���� �Ϸ�");
		System.out.println( end-start/(double)1000);
		
		
		
	}

}
