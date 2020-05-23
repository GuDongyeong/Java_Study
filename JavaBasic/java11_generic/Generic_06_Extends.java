package java11_generic;

public class Generic_06_Extends {
	public static void main(String[] args) {
		
		print(123); // T -> Integer
		
		print(23.456); // T -> Double
		
//		print("Apple"); // T -> String // 에러	
	}
	
	// 제네릭 메소드
	public static <T extends Number> void print(T t) { // Number의 자식클래스만 허용하는 타입파라미터
		System.out.println(t);
	}
	
}
