package java12_exception;

import java.io.IOException;

class ThrowsEx{
	
	public char readChar() throws IOException {
		
		return (char)System.in.read();
		
	}
	
	
}

public class Exception_10_throws {
	public static void main(String[] args) {
		
		ThrowsEx te = new ThrowsEx();
		
		char ch = '\0'; // null ����
//		int ch = -1; // �������� int������ ����ȯ�ؼ� ���� �ʱⰪ�� -1�� ����ϱ⵵
		
		try {

			System.out.print("Input Character : ");
			ch = te.readChar();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		System.out.println("Output : " + ch);
		
		
		
	}

}
