package java10_collection.practice2;

import java.util.Scanner;

public class BookManagerMapEx {
	
//	- 클래스명 : java10_collection.practice2.BookManagerMapEx.java
//    >> main() 포함
//	>> menu() 메소드 추가함
//	public static void menu(){}
//
//		=> 다음 내용이 출력되게 함
//		=> BookManagerMap 클래스 객체 생성함
//
//	*** 도서 관리 프로그램 ***
//
//	1. 새 도서 추가	//putBook(inputBook() 이 리턴한 객체) 실행
//	2. 도서 삭제	//removeBook(삭제할 책번호) 실행
//	3. 도서 검색출력	//searchBook(검색할 도서명) 실행 
//			=> index 리턴받아 printBook(key) 실행
//	4. 전체 출력	//displayAll() 실행
//	6. 끝내기
//
//	>>추가, 삭제, 검색에 필요한 키정보는 키보드로 입력받도록 함
//	//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
//	+ static inputBook() : Book
//
//	//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
//	+ static inputBookTitle() : String
//
//	>> 끝내기 메뉴 선택 전까지는 메뉴 반복 실행되도록 처리함
	
	
	private static final Scanner sc = new Scanner(System.in);
	
	
	////Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
	public static Book inputBook() {
		
		System.out.print("> 도서번호 : ");
		String bNo = sc.next();
		System.out.print("> 도서분류코드(1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		System.out.print("> 도서명 : ");
		String title = sc.next();
		System.out.print("> 저자 : ");
		String author = sc.next();
		
		Book book = new Book(bNo, category, title, author);
		
		return book;
	}
	
	
	//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
	public static String inputBookTitle() {
		String title = sc.next();
		return title;		
	}
	
	
	// 테스트
	private static void test() {
		
		BookManagerMap bookDB = new BookManagerMap();
		
		Book book1 = new Book("10001", 1, "자바 기초", "구동영");		
		Book book2 = new Book("10002", 2, "자바 중급", "구동영");		
		Book book3 = new Book("10003", 3, "자바 고급", "구동영");	
		
		// 객체 추가 test	
		bookDB.putbook( book1 );
		bookDB.putbook( book2 );
		bookDB.putbook( book3 );
		
		bookDB.displayAll();
		
		
		// 객제 제거
		bookDB.removebook( "10001" );
		bookDB.removebook( "10004" );
		
		
		bookDB.displayAll();
		
		// 객체 조회
		bookDB.searchBook( "자바 기초" );
//		bookDB.searchBook( "자바 중급" );
//		
//		// key에 해당하는 책 출력
		bookDB.printBook( "10003" );
		
	}
	
	public static final int PUT = 1;
	public static final int REMOVE = 2;
	public static final int SEARCH = 3;
	public static final int PRINT = 4;
	public static final int END = 6;
	
	public static void menu() {
		
		BookManagerMap manage = new BookManagerMap();
		
		int num;
		
		do {
			
			System.out.println( "\n*** 도서 관리 프로그램 ***\n" );
			System.out.println( "1. 새 도서 추가" );
			System.out.println( "2. 도서 삭제" );
			System.out.println( "3. 도서 검색출력" );
			System.out.println( "4. 전체 출력" );
			System.out.println( "6. 끝내기" );
			System.out.print("\n> INPUT : ");
			
			num = sc.nextInt();
			
			switch( num ) {
			case PUT: 
				System.out.println("\n + + + 새로운 도서 정보 + + + ");
				manage.putbook( inputBook() );
				break;
				
			case REMOVE:
				System.out.print("\n> 삭제할 도서 번호를 입력하시오 ");
				manage.removebook( sc.next() );
				break;
				
			case SEARCH:
				System.out.print("\n> 검색할 도서명을 입력하시오  ");
				String bNo = manage.searchBook( sc.next() );
				manage.printBook(bNo);
				break;
				
			case PRINT:
				System.out.println("\n + + + 모든 도서 정보 + + + ");
				manage.displayAll();
				break;
			
			default:
				System.out.println("\n[ERROR] 잘못된 메뉴입니다");
			}
		}while( num != END );
		
		
	}
	
	
	
	
	public static void main(String[] args) {
//		test();
		menu();			
	}
	
}
