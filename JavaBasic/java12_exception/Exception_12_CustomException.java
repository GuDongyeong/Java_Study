package java12_exception;

import java12_exception.CheckEven;

public class Exception_12_CustomException {
	public static void main(String[] args) {
		
		// 짝수인지 판별 객체
		
		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13); // 홀수 -> 예외 상황 -> "홀수는 안됩니다!" 예외메시지 출력
		} catch (OddNumberException e) {
			e.printStackTrace();
		}
		
		try {
			ce.check(12); // 짝수 -> 정상적인 상황 "짝수가 맞습니다!"
		} catch (OddNumberException e){
			e.printStackTrace();
		}
	}
}
