package java10_collection;

import java12_exception.OddNumberException;

public class CheckEven {
	
	// 전달인자가 짝수인지 홀수인지 판별하는 기능
	public void check(int num) throws OddNumberException {
		
		if( num%2 ==0) { //짝수 - 정상상황
			System.out.println("짝수가 맞습니다");
			
		} else {
			throw new OddNumberException();
		}
		
	}


}
