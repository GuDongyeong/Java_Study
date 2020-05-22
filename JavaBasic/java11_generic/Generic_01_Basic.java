package java11_generic;

import java.util.ArrayList;
import java.util.List;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		//ArrayList is a raw type 원천 타입
		// 타입 파라미터 E를 결정하지 않으면 Object로 사용됨
		
		list.add(123);
		list.add("Apple");
		
		System.out.println("--------------------------------");
		
		List<String> list2 = new ArrayList<>();
		// 부모클래스(변수)와 인스턴스의 데이터타입은 반드시 같아야한다. 인스턴스의 파라미터는 적지않아도 가능
		// 타입 파라미터 E -> String 지정
		
		list2.add("A");
//		list2.add(123); // 에러
		
		//------------------------------------------------------
		
		// 파라미터로 기본 데이터타입 사용 불가 - Wrapper클래스 사용
//		List<int> list3 = new ArrayList<>(); 
		List<Integer> list3 = new ArrayList<>();
		
		list3.add(123); //int 상수 - 오토 박싱
		
		
		//---------------------------------------------------------
		
		//타입 안정성
		// 개발자가 의도한 데이터타입으로만 사용되는 것
		
//		list2.add(true); //에러, String으로만 사용 가능하다
//		list3.add("안녕"); //에러, Integer만 사용가능
		
		//---------------------------------------------------------
		
		String str1 = (String) list.get(1); // 타입 안정성이 없음, 형변환 필요
		
		String str2 = list2.get(1); // 형변환이 필요없다.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
