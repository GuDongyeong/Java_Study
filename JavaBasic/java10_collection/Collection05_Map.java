package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection05_Map {
	public static void main(String[] args) {
		
//		Map map = new HashMap();
		Map map = new Hashtable();
		
		// 삽입
		 
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println( "map : " + map ); // 중괄호로 표현, 대응관계는 = 으로 표현
		
		System.out.println("\n------get()-------"); //조회
		
		System.out.println( map.get(3) ); // 3=Cherry
		System.out.println( map.get(5) ); // null  key가 없을 떄
		
		System.out.println("\n-----put()-------------");
		
		map.put("D", "Durian");
		System.out.println( "map : " + map );
		
		System.out.println( "get(\"D\") : " + map.get("D") ) ;
		
		System.out.println("------------------------");
		
		map.put(2, "Orange"); // 기존에 존재하는 key - value만 치환
		map.put(4, "Apple"); // 존재하지 않는 key, 기존에 존재하는 value
		
		System.out.println("map : " + map);
		
		System.out.println("\n------------contains()-------");
		
		System.out.println("key 5 : " + map.containsKey(5));
		System.out.println("value \"Apple\" : " + map.containsValue("Apple"));
	
		// 5라는 key가 존재하지 않을 경우에 데이터 삽입
		if( !map.containsKey(5) ) {
			map.put(5, "Grape");
		}
		
		System.out.println( map );
		
		if( map.containsKey(555)) {
			String str = (String) map.get(555);
			System.out.println( str.length() );
		}else {
			System.out.println("[ERROR] 555 키가 없음");
		}
		
		
		System.out.println("\n------size()-------------");
		
		System.out.println( map.size());
		
		
		System.out.println("\n-----isEmpty()------------");
		
		System.out.println( map.isEmpty());
		
		System.out.println("\n-----remove()----------"); //제거
		
		map.remove(3); //key가 3인 Entry를 제거
		System.out.println( map );
		
		map.remove(2, "Apple"); // key와 value가 일치하면 Entry 제거
		System.out.println( map );
		
		System.out.println("\n------null값 처리-----------");
		
		// 두개 다 정상적으로 처리
		map.put(null, "Bob"); // key가 null인 상황은 좋지 않음
		map.put(10, null);
		
		System.out.println( map );
		
		map.put(null, null);
		System.out.println( map );
		
		System.out.println("\n-----map -> set -----------");
		
		Set keySet = map.keySet(); //key들을 Set으로 추출
		
		Set entrySet = map.entrySet(); // Entry(key-value 쌍)들을 Set으로 추출
		
		
		System.out.println("keySet : " + keySet );
		System.out.println("entrySet : " + entrySet );
		
		System.out.println("----------------------------");
		
		Set keys = map.keySet(); //key Set
		
		Iterator iter = keys.iterator(); // key Set의 반복자 생상
		
		// Key Set Iterator 반복
		while( iter.hasNext() ) {
			Object key = iter.next(); // key꺼내기
			
			System.out.println( map.get(key) ); // key에 해당하는 value 출력
		}
		
		
				
		
 	}

}
