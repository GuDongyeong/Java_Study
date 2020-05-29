package java13_io.bytestream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {
	public static void main(String[] args) {
		
		InputStream is = System.in; // ǥ���Է� ��ü
		
		StringBuilder sb = new StringBuilder(); // �Է¹��� ������ �����
		
		int in = -1; //�Է¹��� ������
		// ������ �߻��� ��� 0���� �ʱ�ȭ�ϸ� ��ȿ�� ���� �̹� ���� ������ -1��
		
		try {
			while ((in = is.read()) != -1) {
				
				//�Էµ� �ƽ�Ű�ڵ带 ���ڷ� �����Ͽ� StringBuilder�� ����
				sb.append( (char)in );
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if( is != null)		is.close();//��Ʈ�� �ݱ�
				// try���� ������ �߻��Ͽ� readó���� ���� �ʰ� null���� �״�� ������ ���� ���� �ڿ��� �Ҵ���� ���� �����̱� ������ ��Ʈ���� ���� �ʿ䰡 ����
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("\n<< �Է� ��� >>");
		System.out.println("sb : " + sb);
		
		// Ű���� ��Ʈ���� ��� �����ִ� ��ġ?�̱� ������ ����ڰ� ������ ���� EOF�� �Է����־�� �Ѵ�.
		// ctrl + z
		
		// Ű���忡�� EOF�� �����ϱ� ���� ctrl + z�� ����Ѵ�
		
		// ctrl + z : ^Z (EOF)
		
		
	}// main end

}
