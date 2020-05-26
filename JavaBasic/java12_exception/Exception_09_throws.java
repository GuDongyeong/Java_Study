 package java12_exception;

import java.io.IOException;

public class Exception_09_throws {
	public static void main(String[] args) {
		
		System.out.print("Input : ");
		
		try {
			char input = (char) System.in.read(); // 키보드의 입력을 1바이트 받기, 키보드는 외부 기기, 외부기기 입출력에 대한 예외가 IOException
			// throws 거의 Checked Exception 에서 강제로 try-catch문을 사용하도록 한다
			
			System.out.println("입력값 : " + input);
			System.out.println("ASCII : " + (int) input);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}

}
