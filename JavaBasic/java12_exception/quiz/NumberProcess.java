package java12_exception.quiz;

import java12_exception.quiz.exception.NumberRangeException;

public class NumberProcess {
	
//	클래스 : java12_exception.quiz.NumberProcess
//	[디폴트 생성자]
//
//	[메소드]
//	public boolean checkDouble(int n1, int n2){}
//	// 임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인하고
//	배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴함
//	//단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
//	NumberRangeException 발생시킴
//	에러메시지 : "1부터 100사이의 값이 아닙니다."

	public boolean checkDouble(int n1, int n2) {
		
		if( n1 < 1 && n1 > 100 && n2 < 1 && n2 > 100 ) {
			throw new NumberRangeException();
		}else {
			
			if( n1%n2 == 0) {
				return true;
			}else {
				return false;
			}
			
		}
		
		
		
	}
	
	
	
	
}
