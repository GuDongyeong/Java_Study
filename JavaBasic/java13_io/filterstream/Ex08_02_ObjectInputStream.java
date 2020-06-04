package java13_io.filterstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex08_02_ObjectInputStream {
	public static void main(String[] args) {
		
		// ���� ����
		File file = new File("./src/java13_io/filterstream/", "ObjectTest2.ser"); 
		
		// ��Ʈ�� �Է� ��ü
		ObjectInputStream ois = null;
		
		try {
			// ��Ʈ�� ��ü ����
			ois = new ObjectInputStream( new BufferedInputStream( new FileInputStream(file)));
			
			List list = (List)ois.readObject();
			
			for(int i =0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if( ois != null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // main end

}
