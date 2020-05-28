package java12_exception.quiz;

import java.util.Scanner;

import java12_exception.quiz.exception.CharCheckException;

public class ExceptionQuizEx {
	
	final static Scanner sc = new Scanner(System.in);

	public static void quiz1() {
		
		
		CharacterProcess cp = new CharacterProcess();
		
		try {
			System.out.print("영문자를 입력하시오 : ");
			
			int cnt = cp.countAlpha(sc.nextLine());
			
			System.out.println( "문자열 길이 : " + cnt );
			
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void quiz2(){
		
		NumberProcess np = new NumberProcess();
		
		System.out.print("정수 2개를 입력하시오 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		boolean multiple = np.checkDouble(n1, n2);
		
		if( multiple ) {
			System.out.println( n1 + "는 " + n2 + "의 배수이다");
		}else {
			System.out.println( n1 + "는 " + n2 + "의 배수가 아니다");
		}
		
		
	}
	//2 개의 정수를 입력받아, checkDouble 메소드로 전달하면서 실행함
//	리턴된 결과로 "ooo는 ooo의 배수이다/배수가 아니다." 출력함
	
	
	public static void main(String[] args) {
//		quiz1();
		quiz2();
		
		
	}
}
