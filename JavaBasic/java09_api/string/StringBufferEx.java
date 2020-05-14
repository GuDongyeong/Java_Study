package java09_api.string;

public class StringBufferEx {
	public static void main(String[] args) {
		
		System.out.println("---StringBuffer() 생성------------------------");
		
		StringBuffer sb = new StringBuffer();

		info(sb);
		
		System.out.println("\n---StringBuffer(\"Hello\")------------------");
		// \ : 문자열 내에서 특수한 기능을 표현하려고 할때 역슬래쉬 사용
		
		StringBuffer sb2 = new StringBuffer("Hello");
		
		info(sb2);
		
		System.out.println("\n---StringBuffer( 5 )------------------------");
		
		StringBuffer sb3 = new StringBuffer(5);
		
		info( sb3 );
		
		
		System.out.println("\n---Apple 추가-------------------------------");
		
		sb3.append("Apple");
		
		System.out.println( sb3 ); // toString이 오버라이딩되어 있다. 값이 나옴
		info(sb3);
		
		System.out.println("\n---Banana 추가------------------------------");
		
		
		sb3.append("Banana");
		System.out.println(sb3);
		info(sb3);
		
		// 스트링버퍼 내부에 공간을 확장시켜서 바나나를 추가한 것이다. 스트링처럼 새로운 공간을 만드는 것이 아니다.
		
		//---------------------------------------------------------------------
		
		// sb3에 작업!

		// 5번째 인덱스에 "Orange" 넣고 출력 - insert
		System.out.println("\n---insert-------");
		
		sb3.insert(5, "Orange");
		System.out.println( sb3 );
		info( sb3 );
		
		
		
		// 3번째 인덱스 삭제하고 출력 - deleteCharAt
		System.out.println("\n---deleteCharAt-------");
		
		sb3.deleteCharAt(3);
		System.out.println( sb3 );
		info( sb3 );	
		
		
		
		// substring(1, 7) 결과 출력
		// sb3 출력
		// info 출력
		System.out.println("\n---substring-------");
		
		System.out.println(sb3.substring(1, 7)); //string 타입으로 반환
		
		System.out.println( sb3 ); //원본은 그대로 둔다
		info( sb3 );
		
		// trimToSize() 수행
		// info 출력
		System.out.println("\n---trimToSize-------");
		
		sb3.trimToSize();
		info( sb3 );
		
		// reverse() 호출 후 결과 출력
		System.out.println("\n---reverse----------");
		sb3.reverse();
		
		System.out.println( sb3 );
		info( sb3 );
		
		
	}
	
	
	public static void  info(StringBuffer s) {
		System.out.println("length : " + s.length()); // 문자열 길이, StringBuffer 안에 저장된 문자열의 길이를 알려주는 메소드
		System.out.println("capacity : " +  s.capacity()); // 최대 길이, 수용 능력 용량, 채워넣을 수 있는 한계, 최대 길이 케파
	}
	
}
