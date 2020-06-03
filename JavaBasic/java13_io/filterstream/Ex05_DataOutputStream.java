package java13_io.filterstream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_DataOutputStream {
	public static void main(String[] args) {
		
		//��� ���� ��ü ����
		File file = new File("./src/java13_io/filterstream", "DataTest.txt");
		
		// ������ ��� ��Ʈ��
		DataOutputStream dos = null;
		
		try {
			// ������ ��� ��Ʈ�� ����
			dos = new DataOutputStream( new BufferedOutputStream( new FileOutputStream(file)));
			
			dos.write(100); // �ƽ�Ű�ڵ�
			
			dos.writeBoolean(true); // 1B
			dos.writeChar('A'); // 2B
			dos.writeInt(88); // 4B
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( dos != null )	dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
