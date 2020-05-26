package java12_exception;

public class Exception_06_throw {
	public static void main(String[] args) {
		
//		Exception e = new NullPointerException(); // 예외 객체 생성	throw e; -> Exception이 checked Exception이므로 try catch를 강제하기 때문에 정적체크, 에러 발생
		
		// 예외를 직접 발생시키기 - throw 사용
		
		NullPointerException e = new NullPointerException(); // 예외 객체 생성
		
		try {
			throw e;
		}catch( Exception e1 ) {// 이미 e가 있으므로 e1, e2, ... 로 표현
			e1.printStackTrace();
		}
		
		//-------------------------------------------
		
		
//		throw new NullPointerException();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}