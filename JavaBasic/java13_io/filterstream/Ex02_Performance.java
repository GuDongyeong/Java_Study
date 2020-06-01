package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		// ���� ��, Performance Evaluation
		//	�˰��� ���� �� ����ð� üũ -> start
		//	�˰��� ���� �� ����ð� üũ -> end
		//	���� ���̸� ���Ѵ� -> �˰��� ����ð� : end - start
		
		// �Է´�� ���� ��ü
		File file = new File( "./src/java13_io/", "Source.txt");
		System.out.println("[TEST] file : " + file.exists());
		
		long start = System.currentTimeMillis(); // ���� �ð��� �и��ʷ� ��ȯ
		// ���⿡ ����ð��� ������ �˰����� �ۼ���
		
		long end = System.currentTimeMillis(); // ���� �ð��� �и��ʷ� ��ȯ
		
		System.out.println( end - start );
		System.out.println((end-start)/(double)1000); // �� ������ Ȯ��
		
		// ���� �Է� ��Ʈ�� ��ü
		FileInputStream fis = null; //1�� ��Ʈ��
		BufferedInputStream bis = null; // 2�� ��Ʈ��, ���� ��� ���� ��Ʈ��
		
		// ���� �Է� ���� ���� ����
		byte[] buf = new byte[1024]; //�Է� ������ �ӽ� ����� // ���α׷��� ����
		int len = 0; // �Է� �������� ����
		
		
		try {
			
			fis = new FileInputStream(file); // File -> FileInputStream
			bis = new BufferedInputStream(fis); // �Ű����� InputStream, 1�� ��Ʈ���� �����ϱ� ���� 
			// FileInputStream -> BufferedInputStream
			
			
			start = System.currentTimeMillis();
			while( (len = bis.read(buf)) != -1) {}
			end = System.currentTimeMillis();
			System.out.println((end-start)/(double)1000); // �� ������ Ȯ��
			
			
			System.out.println("-------------------------");
			
			fis = new FileInputStream(file); // File -> FileInputStream
			bis = new BufferedInputStream(fis); // �Ű����� InputStream, 1�� ��Ʈ���� �����ϱ� ���� 
			// FileInputStream -> BufferedInputStream
		
			start = System.currentTimeMillis();
			while( (len = fis.read(buf)) != -1) {}
			end = System.currentTimeMillis();
			System.out.println((end-start)/(double)1000); // �� ������ Ȯ��
			
			
			
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
