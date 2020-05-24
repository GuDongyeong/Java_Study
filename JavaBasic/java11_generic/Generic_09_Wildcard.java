package java11_generic;

import java.util.Arrays;
import java.util.List;

public class Generic_09_Wildcard {
	
//	public static void display(List<?> list) { //  ? : 와일드 카드 // 원래는 타입파라미터는 상속구조를 무시하지만 ?로 여러개 처리가능, 타입파라미터의 상속구조를 만들어주는 것
//	public static void display(List<? extends Number> list) { 
	public static void display(List<? super String> list) { 
		
		for( Object o : list) {
			System.out.println( o );
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList( 10, 20, 30 );
		
		display(iList);
		
		System.out.println("------------------");
		
		List<String> sList = Arrays.asList( "A", "B", "C" );
		
		display(sList);
		
		System.out.println("------------------");
		
		
		Object o = null;
		
		Integer i = null;
		
		o = i; // Object 클래스는 Integer의 부모 클래스, 자동형변환으로 대입 가능
		
		System.out.println("------------------");

		// 제네릭(타입파라미터)은 자바의 기본 상속구조를 무시한다
		// List List<Object> List<Integer> 은 서로 연관성이 낮다
		
		List<Object> ol = null;
		List<Integer> il = null;
		
//		ol = il; // Type mismatch 에러
		
		
		
	}

}
