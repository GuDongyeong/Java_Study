package java10_collection;

import java.util.ArrayList;
import java.util.List;

public class Collection01_ArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//자료구조에서 자주 사용되는 동작(로직, 알고리즘)
		// CRUD 작업
		// Create	- 추가/삽입		ex 게시판 글 쓰기
		// Read		- 조회/탐색		ex 글 검색
		// Update	- 수정/변경		ex 글 수정
		// Delete	- 삭제/제거		ex 글 삭제
		
		System.out.println("\n------삽입---------------");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println( list ); // toString 오버라이딩
		
		System.out.println("\n------조회---------------");
		
		System.out.println( list.get(1) ); // Banana
		
		System.out.println("---------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("\n------수정---------------");
		
		list.set(1, "Orange");
		
		System.out.println( list );
		
		
		System.out.println("\n------삭제---------------");
		
		
		System.out.println(list.remove("Banana"));
		
		System.out.println("지워진 값 : " + list.remove(1));
		System.out.println( list );
		
		
		System.out.println("\n------삽입---------------");
	
		list.add("Tomato");
		
		System.out.println(list);
		
		
		System.out.println("\n---contains()------------"); // 요소가 속해 있는지
		
		System.out.println( list.contains("Tomato"));
		
		
		System.out.println("\n---isEmpty()------------");
		
		System.out.println( list.isEmpty() ); // 리스트가 비어있는지, 요소가 없는지
		
		System.out.println("------------------");
		
		List l = null; //리스트를 생성하지 않음 객체가 아예 없다
		
//		if( l.isEmpty() ); // NullPointerException
		if( l == null ); //정상, 리스트를 생성하지 않았는지 검사
		
		
		//-------------
		
		
		List ll = new ArrayList(); // 요소를 넣지 않음
		
		if( ll.isEmpty() ); //정상, 요소가 하나도 없는지 검사
		if( ll == null ); //정상, 리스트를 생성하지 않았는지 검사
		
		System.out.println( l ); // null
		System.out.println( ll ); // []
		
		
		System.out.println("\n---모든 요소 출력하기------------");
		
		list.add(123);
		list.add(true);
		list.add(3.14);
		
		System.out.println( list ); // 1. 객체를 이용한 출력
		// 배열과의 차이 - 하나의 리스트에 아무 타입이나 들어갈 수 있다. 제네릭으로 이를 제한할 수 있음(Wrapper만 들어갈수있음)
		
		for(int i=0;i<list.size();i++) { // 2. for문 출력
			System.out.println( list.get(i) );
		}
		
		for( Object element : list ) { // 3. for-each문을 이용한 출력
			System.out.println( element );
		}
		
		System.out.println("\n---clear()---------------------");
		
		System.out.println(list);
		
		list.clear(); // 요소 전체 삭제
		
		System.out.println(list);
		
		list = null; //객체 삭제( GC 동작)
		
	}

}
