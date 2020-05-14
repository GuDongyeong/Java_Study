package java09_api.string;

public class StringEx {
	public static void main(String[] args) {
		
		String str1 = "Apple"; // 문자형 리터럴 상수
		
		String str2 = new String("Banana"); // 문자열 객체
		
		System.out.println("----length()----");
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str1의 길이 : " + str2.length());
		
		System.out.println("Cherry의 길이 : " + "Cherry".length()); //문자열상수도 String 데이터타입이기 때문에 가능
		
		System.out.println("\n----equals()----------------");
		
		//String은 equals()를 오버라이딩하여 동등성을 비교하도록 한다
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("Apple.equals(str1) : " + "Apple".equals(str1));
		
		// 조심! 속지말자!
		System.out.println("Apple==str1 : " + ("Apple" == str1 ));
		
		// ** 문자열을 비교할 때는 == 쓰지 말고 equals() 메소드를 써야한다
		
		String test = null;
		
//		if( test.equals("Durian") ) {
//			System.out.println("같다!");
//		}
//		//NullPointerException 발생
		
		if( "Durian".equals( test )) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// 상수를 먼저 비교하기 
		// equals에 안전장치가 되어 있다 null값의 경우 false처리 되도록
		
		
		String temp = " "; // 빈문자열 null과 다르다 참조값이 있음

	}

}
