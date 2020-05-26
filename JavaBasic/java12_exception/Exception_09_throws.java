 package java12_exception;

import java.io.IOException;

public class Exception_09_throws {
	public static void main(String[] args) {
		
		System.out.print("Input : ");
		
		try {
			char input = (char) System.in.read(); // Ű������ �Է��� 1����Ʈ �ޱ�, Ű����� �ܺ� ���, �ܺα�� ����¿� ���� ���ܰ� IOException
			// throws ���� Checked Exception ���� ������ try-catch���� ����ϵ��� �Ѵ�
			
			System.out.println("�Է°� : " + input);
			System.out.println("ASCII : " + (int) input);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}

}
