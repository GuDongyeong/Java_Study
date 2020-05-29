package java13_io.bytestream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01 {
	public static void main(String[] args) {
		
	
	InputStream is; // 입력객체, 추상클래스라 스스로 객체 생성 불가능
	
	is = System.in; //표준 입력
	

	
	
	
	
	try {
		System.out.print("입력하세요 : ");
		int in = is.read(); //1바이트 입력, 아스키코드 반환
		
		System.out.println(in);
		
		System.out.println("문자 : " + (char)in );
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	
	}
}
