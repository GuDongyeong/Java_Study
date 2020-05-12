package java08_abstract.interfaceEx.quiz2;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		ArrayPractice ar = new ArrayPractice();
		
//		ar.getClass();
		
		ar.add("Apple");
		ar.add("Banana");
		ar.add("Cherry");

		ar.add("Apple");
		ar.add("Banana");
		ar.add("Cherry");
		ar.add("DOng");
		ar.add("yeong");
		ar.add("Gu");
		ar.add("nana");
		ar.add("nono");
		ar.add("nono");

		ar.print(); // Apple, Banana, Cherry
		System.out.println("----------");
		
		
		ar.remove("Banana");
		
		
		
		ar.print(); // Apple, Cherry
		System.out.println("----------");

		System.out.println( ar.get(1) ); // Cherry
		System.out.println( ar.get(2) ); // null
		System.out.println("----------");
		
		System.out.println( ar.find("Apple") ); // 0
		System.out.println( ar.find("Banana") ); // -1
		System.out.println("----------");
		
		
	
	}
}


