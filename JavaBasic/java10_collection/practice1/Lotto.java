package java10_collection.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	
	// 구현 내용
	// 1. 1~45 사이의 정수를 중복되지 않게, 6개 발생
	// 2. 자동 오름차순정렬되게 처리하는 Set 계열 - TreeSet Set은 중복 데이터를 허용 X
	// 3. 리스트로 바꾸어 출력. ArrayList 생성자 이용
	
	public static void main(String[] args) {
		
		lottoDisplay();
		
	}
	
	
	
	public static void lottoDisplay() {
		
		Set<Integer> set = new TreeSet();
		
		// TreeSet의 요소가 6개가 될 때까지 반복
		while( set.size() != 6 ) { // 조건문은 일상적인 명제를 반대로 
			
			set.add((int)(Math.random()*45 + 1) );
		}
		
		// 방법1 리스트로 변환하기
		List list = new ArrayList(set);
		
		System.out.println( list );
		
		// 방법2 배열로 변환하기
		
		Object[] arr = set.toArray();
		
		System.out.println( Arrays.toString(arr));
		
	}

}
