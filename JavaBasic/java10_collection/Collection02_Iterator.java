package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection02_Iterator {
	public static void main(String[] args) {
		
		List list = Arrays.asList("A", "B", "C", "D", "E"); // asList정적 메소드.. Arrays 클래스에서 매개변수를 한번에 ArrayList로 만들어준다
		// 선언과 동시에 초기화
		
		
		// 반복자, Iterator
		//	컬렉션의 모든 요소들을 순차적으로 읽어오는 방법(접근 방법)을 표준화한 것
		
		Iterator iter; //반복자
		iter = list.iterator(); // 리스트의 iterator 생성하기, 리스트 안에서 포인터로 가리키는 역할이기 때문에 new로 새로운 클래스를 만드는 것이 아니다
		
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
		// Iterator의 주요 메소드
		//	boolean hasNext() : 다음 요소의 존재여부, true/false 반환
		//	E next() : 다음 요소 반환
		
		
		
		
		
		
	}
	
}
