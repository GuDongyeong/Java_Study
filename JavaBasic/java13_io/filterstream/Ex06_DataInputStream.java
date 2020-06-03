package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex06_DataInputStream {
	public static void main(String[] args) {
		
		//��� ���� ��ü ����
		File file = new File("./src/java13_io/filterstream", "DataTest.txt");
		
		// ������ �Է� ��Ʈ�� ����
		DataInputStream dis = null;
		
		try {
			// ������ �Է� ��Ʈ�� ����
			dis = new DataInputStream( new BufferedInputStream( new FileInputStream(file)));
			
			int d1 = dis.read();
			boolean d2 = dis.readBoolean();
			char d3 = dis.readChar();
			int d4 = dis.readInt();
			// ����ߴ� ������ ���߾ �״�� �Է�

			System.out.println("d1 : " + (char)d1);
			System.out.println("d2 : " + d2);
			System.out.println("d3 : " + d3);
			System.out.println("d4 : " + d4);
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if( dis != null ) dis.close(); // ��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
