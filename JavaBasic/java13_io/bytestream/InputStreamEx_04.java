package java13_io.bytestream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_04 {
	public static void main(String[] args) {
		
		InputStream is = System.in; // ǥ�� �Է� ��ü
		
		byte[] b = new byte[1024]; // �Է� �������� �ӽ� �����, �޸� ������
		int len = -1; //�Է¹��� �������� ����
		int total = 0; // �Է��� �������� ��ü ����
		
		StringBuilder sb = new StringBuilder(); // �Է¹��� ������ �����
		
		System.out.println("<<�Է� ��� ��>>");
		
		try {
			
			while( (len = is.read(b, 0, b.length)) != -1) {
				total += len;
				
				System.out.println("len : " + len); // �Է¹��� ���� ���
				
				String str = new String(b, 0, len);
				System.out.println("b : " + str);
//				System.out.println("b : " + b); // �迭�� ������ ���

				sb.append(str);				
				
				//new String(b)�� ��ȯ�ϸ� byte[]�� ��� ��Ҹ� ��ȯ�Ѵ�
//				 �̶� ������ �Է��ߴ� �����͵� ���� ��ȯ�ع�����
//				 new String(b, 0, len)�� �̿��Ͽ� �Է��� ���̸�ŭ�� ��ȯ�Ͽ� ����Ѵ�
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("��ü " + total + " Byte �Է� �Ϸ�");
		System.out.println("\n<< �Է� ������ >>");
		System.out.println( sb );
		
		
		
	}

}
