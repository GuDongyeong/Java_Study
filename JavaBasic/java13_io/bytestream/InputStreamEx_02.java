package java13_io.bytestream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {
	public static void main(String[] args) {
		
		InputStream is = System.in; // 표준입력 객체
		
		StringBuilder sb = new StringBuilder(); // 입력받은 데이터 저장소
		
		int in = -1; //입력받은 데이터
		// 에러가 발생한 경우 0으로 초기화하면 유효한 값이 이미 들어가기 때문에 -1로
		
		try {
			while ((in = is.read()) != -1) {
				
				//입력된 아스키코드를 문자로 변형하여 StringBuilder에 저장
				sb.append( (char)in );
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if( is != null)		is.close();//스트림 닫기
				// try에서 에러가 발생하여 read처리가 되지 않고 null값을 그대로 가지고 있을 경우는 자원이 할당되지 않은 상태이기 때문에 스트림을 닫을 필요가 없음
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("\n<< 입력 결과 >>");
		System.out.println("sb : " + sb);
		
		// 키보드 스트림은 계속 열려있는 장치?이기 때문에 사용자가 강제로 종료 EOF를 입력해주어야 한다.
		// ctrl + z
		
		// 키보드에서 EOF를 전송하기 위해 ctrl + z를 사용한다
		
		// ctrl + z : ^Z (EOF)
		
		
	}// main end

}
