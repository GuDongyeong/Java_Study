package java11_generic;

// 일반 클래스
class Class03{
	
	// 일반 메소드
	public void display(int n) {
		
	}
	
	// 제네릭 메소드
	public <T> T print(T t) { // T는 Object 하위에 있다 // 반환타입, 매개변수, 지역변수에서 사용가능
		
//		T data = 123; // int형 데이터이므로 Object와 변환?되지 않음
		T data = (T) null; // 형변환에도 사용할 수 있다.
		return data;
	}
	
}

//제네릭 클래스
class Class03_2<T> {
	
	//제네릭 메소드
	public <K> void display(K obj, T data) { // 문법적으로 이 경우도 가능하다
		
	}
}

public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		
		//--------------------------------
		
		c03.print(123); // 타입파라미터 전달하지 않음. T-> Integer 매개변수 타입으로 자동으로 결정된다.
		
//		c03.<Double>print(555); // 에러
		c03.<Double>print(12.34); // T -> Double // 타입파라미터를 명시하려면 메소드 인자와 같은 타입이어야 한다.
		
				
		
		
	}

}
