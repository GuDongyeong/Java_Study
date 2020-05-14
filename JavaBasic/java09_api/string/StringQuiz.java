package java09_api.string;

public class StringQuiz {
	public static void main(String[] args) {
		
		
		String str1 = "Apple"; // 문자형 리터럴 상수
		
		String str2 = new String("Banana"); // 문자열 객체
		
		
		System.out.println("\n---toLowerCase()-------");
		// str1 문자열을 모두 소문자로 변환하여 리턴
		String lower = str1.toLowerCase();
		System.out.println("str1 : " + str1);
		System.out.println("lower : " + lower );
		
		
		System.out.println("\n---toUpperCase()-------");
		// str2 문자열을 모두 대문자로 변환하여 리턴
		String upper = str2.toUpperCase();
		System.out.println( "str1 : " + str1 );
		System.out.println( "upper : " + upper );
		
		System.out.println("\n---charAt-------");
		// "Hello Java"에서 J 값 얻어서
		// char변수 ch에 저장, 출력 (charAt)
		char ch = "Hello Java".charAt(6);
		System.out.println( ch );
		
		
		System.out.println("\n---concat-------");
		// str1에 ", HIHIHI" 라는 문자열 추가하고 출력
		System.out.println( str1.concat("HIHIHI") );
		

		System.out.println("\n---replace-------");
		// str1의 'A'을 'a'로 변환
		System.out.println( str1.replace('A', 'a') );
		
				
		System.out.println("\n---replace-------");
		// str1에서 "ple"를 "PLE"로 변환
		System.out.println( str1.replace("ple", "PLE") );
		
		
		System.out.println("\n---substring-------");
		// str1에서 "pl" 찾아서 출력 (substring)
		System.out.println( str1.substring(2, 4));
		
		
		System.out.println("\n---contains-------");
		// str1에 "pP"가 있는지 판별
		boolean res1 = str1.contains("pP");
		System.out.println( res1);
		System.out.println( str1.contains("Ap"));

		
	}

}
