package java12_exception;

import java.io.IOException;

class ThrowsTest {
	
	public void method() throws IOException { //���� ó���� ���ѱ�� ��
		throw new IOException();
		
	}	
}


public class Exception_08_throws {
	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
//		tt.method();
		
		try {
			tt.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		// main �޼ҵ忡 throws ���� ���� �� ��
		
		
	}

}
