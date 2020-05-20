package java10_collection.practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookManagerMap {
	
	private HashMap booksMap;
	
	public BookManagerMap() {
		this.booksMap = new HashMap();
	}
	
	public BookManagerMap( HashMap map ) {
		this.booksMap = map;
	}
	
	 // 메소드
	
	// 맵에 객체 추가
	public void putbook( Book book ) {
		booksMap.put( book.getbNol(), book );		
	}
	
	
	// 맵에서 객체 제거
	public void removebook( String key ) {
		if( booksMap.containsKey(key)) {
			booksMap.remove(key);		
		} else {
			System.out.println("\n*** [ERROR] 해당하는 도서가 없습니다 ***\n");
		}
	}
	
	// 맵에서 객체 조회
	public String searchBook( String bTitle ) {
		
		String bNo = null;
		
		Set set = booksMap.keySet();
		Iterator iter = set.iterator();
		
		while( iter.hasNext() ) {
			
			Book book = (Book) booksMap.get( iter.next() );
			
			if( bTitle.equals( book.getTitle() ) ){
				bNo = book.getbNol();
				break;
			}	
		}
		return bNo;		
	}
	
	// 맵정보 모두 출력
	public void displayAll() {
		
		Set set = booksMap.keySet();
		Iterator iter = set.iterator();
		System.out.println( "\n도서번호\t분류코드\t도서명\t\t저자");
		
		while( iter.hasNext() ) {
			
			Book book = (Book) booksMap.get( iter.next() );
			System.out.println( book.getbNol() + "\t\t" + book.getCategory() + "\t\t" + book.getTitle() + "\t\t" + book.getAuthor());
		}
		System.out.println("=========================================================");
	}
	
	
	// key에 해당하는 Book 출력
	public void printBook(String key) {
		
		if( key != null ) {
			System.out.println( "도서번호\t분류코드\t도서명\t\t저자");
			Book book = (Book) booksMap.get(key);
			System.out.println( book.getbNol() + "\t\t" + book.getCategory() + "\t\t" + book.getTitle() + "\t" + book.getAuthor());
			System.out.println("---------------------------------------------------------");
		}else {
			System.out.println("[ERROR] 존재하지 않는 도서입니다");
		}
	
	}
	
}
