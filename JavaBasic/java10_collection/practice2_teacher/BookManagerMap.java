package java10_collection.practice2_teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BookManagerMap implements BookManagerMapInterface {

	private HashMap booksMap;
	
	public BookManagerMap() {
		booksMap = new HashMap();
	}
	
	public BookManagerMap(HashMap map) {
		this.booksMap = map;
	}
	
	@Override
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	@Override
	public void removeBook(String bNo) {	
		booksMap.remove(bNo);
	}
	
	@Override
	public String searchBook(String title) { //entrySet() ���
		Set bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = (Book) booksMap.get(iter.next());
			
			if( title.equals(currentBook.getTitle()) ) {
				return currentBook.getbNo();
			}
		}
		
		return null;
	}
	
	@Override
	public void displayAll() {
		System.out.println("��ȣ\tī�װ�\t����\t����");
		
		Set bNos = booksMap.keySet();
		Iterator<String> iter = bNos.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = (Book)booksMap.get(iter.next());
			
			printBook(currentBook.getbNo());
		}
		
	}
	
	@Override
	public void printBook(String bNo) {
		Book book = (Book)booksMap.get(bNo);
		if( book == null ) {
			System.out.println("���� å�Դϴ�");
			return;
		}
		System.out.print(book.getbNo() + "\t"); //å��ȣ
		System.out.print(getCategoryText(book.getCategory()) + "\t"); //ī�װ�(�ѱ�)
		System.out.print(book.getTitle() + "\t"); //����
		System.out.println(book.getAuthor() + "\t"); //����
	}
	
	//ī�װ� �̸��� ��ȯ
	private String getCategoryText(int category) {
		switch(category) {
		case 1:
			return "�ι�";
		case 2:
			return "�ڿ�����";
		case 3:
			return "�Ƿ�";
		case 4:
			return "��Ÿ";
		default:
			return null;
			
		}
	}
}
















