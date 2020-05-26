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
		
		char ch = '\0'; // null 문자
//		int ch = -1; // 문자형을 int형으로 형변환해서 쓸때 초기값을 -1로 사용하기도
		
		try {

			System.out.print("Input Character : ");
			ch = te.readChar();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
		System.out.println("Output : " + ch);
		
		
		
	}

}
