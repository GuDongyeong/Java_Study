package java13_io.bytestream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01 {
	public static void main(String[] args) {
		
	
	InputStream is; // �Է°�ü, �߻�Ŭ������ ������ ��ü ���� �Ұ���
	
	is = System.in; //ǥ�� �Է�
	

	
	
	
	
	try {
		System.out.print("�Է��ϼ��� : ");
		int in = is.read(); //1����Ʈ �Է�, �ƽ�Ű�ڵ� ��ȯ
		
		System.out.println(in);
		
		System.out.println("���� : " + (char)in );
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	}
}
