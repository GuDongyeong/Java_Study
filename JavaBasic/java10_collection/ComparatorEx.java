package java10_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	public static void main(String[] args) {
		
		Person p1 = new Person(2, "Alice", "Swimming");
		Person p2 = new Person(3, "Andy", "Soccer");
		Person p3 = new Person(1, "Kim", "Golf");
		
		List<Person> list = new ArrayList<>();
		
		list.add( p1 );
		list.add( p2 );
		list.add( p3 );
		
		// 정렬 전 출력
		for( Person p : list) {
			System.out.println( p );
		}
		
		Comparator<Person> comp = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				// 반환값
				//	음수 : o1의 데이터가 작다, 정렬할 때 앞으로 보낸다
				//	0 : o1 과 o2의 데이터가 같다
				//	양수 : o1 의 데이터가 크다, 정렬할 때 뒤로 보낸다
				
				// no 를 기준으로 오름차순 정렬
//				if( o1.getNo() < o2.getNo() ) {
//					return -1;
//				}else if( o1.getNo() > o2.getNo() ) {
//					return 1;
//				}else {
//					return 0;
//				}
				
				// no 를 기준으로 내림차순 정렬
//				if( o1.getNo() < o2.getNo() ) {
//					return 1;
//				}else if( o1.getNo() > o2.getNo() ) {
//					return -1;
//				}else {
//					return 0;
//				}
				
				
				//----------------------------------------
				// "String".compareTo("String") : ASCII 코드 기반 왼쪽이 작으면 음수, 크면 양수 반환
				
				//name을 기준으로 오름차순 정렬
//				if( o1.getName().compareTo(o2.getName() ) < 0 ){//왼쪽이 작은 경우
//					return -1; // 정렬할 때 앞으로 보내기
//				} else if( o1.getName().compareTo(o2.getName() ) > 0  ) { // 왼쪽이 큰 경우
//					return 1; // 정렬할 때 뒤로 보내기
//				} else {
//					return 0;
//				}
				
				//name을 기준으로 내림차순 정렬
//				if( o1.getName().compareTo(o2.getName() ) < 0 ){//왼쪽이 작은 경우
//					return 1; // 정렬할 때 뒤로 보내기
//				} else if( o1.getName().compareTo(o2.getName() ) > 0  ) { // 왼쪽이 큰 경우
//					return -1; // 정렬할 때 앞으로 보내기
//				} else {
//					return 0;
//				}
				
				// hobby를 기준으로 오름차순 정렬
//				if( o1.getHobby().compareTo(o2.getHobby()) <0 ) {
//					return -1;
//				} else if ( o1.getHobby().compareTo(o2.getHobby()) > 0 ) {
//					return 1;
//				} else {
//					return 0;
//				}
				
				// hobby를 기준으로 내림차순 정렬
				if( o1.getHobby().compareTo(o2.getHobby()) <0 ) {
					return 1;
				} else if ( o1.getHobby().compareTo(o2.getHobby()) > 0 ) {
					return -1;
				} else {
					return 0;
				}			
			}
		};
		
		
		// compare 메소드가 있어야만 정렬을 수행한다. compare메소드는 우리가 직접 구현
		Collections.sort(list, comp);
		System.out.println("-------");
		// 정렬 후 출력
		for( Person p : list) {
			System.out.println( p );
		}
		
		
	}

}
