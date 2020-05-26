package java12_exception;

import java.io.IOException;

class ThrowsTest {
	
	public void method() throws IOException { //예외 처리를 떠넘기는 것
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
				
		// main 메소드에 throws 절대 걸지 말 것
		
		
	}

}
