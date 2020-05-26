package java12_exception;

class ThrowTest{

	public void print(String str, int cnt) {
	
		if( str == null ) { //예외상황
			
			throw new NullPointerException(); //예외발생시키기
			
		}
		
		for(int j=0;j<cnt;j++) {
			System.out.println( str );
		}
	}
}

public class Exception_07_throw {
	public static void main(String[] args) {
		
		ThrowTest tt = new ThrowTest();
		
		
		try {
			tt.print("HI", 3); //HI를 3번 출력
			tt.print(null, 3); //HI를 3번 출력
			
		} catch(NullPointerException e) {
			System.out.println("[WARN] 문자열이 null로 입력됐습니다");
		}
	}

}
