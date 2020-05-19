package java10_collection;

import java.util.Stack;

public class Collection07_Stack {
	public static void main(String[] args) {
		
		// Stack
		
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println( stack );
		
		System.out.println("---------------");
		
		System.out.println( stack.pop() ); // Cherry
		System.out.println( stack.pop() ); // Banana
		
		System.out.println("------------------");
		
		System.out.println( stack );
		System.out.println( stack.size() );
		
		// 둘 다 비어있는지 확인하는 메소드
		System.out.println( stack.isEmpty() );
		System.out.println( stack.empty() );
		
		System.out.println("----------------------");
		
		stack.push("Grape");
		stack.push("Orange");
		stack.push("Peach");
		
		
		// stack이 비어있지 않으면 반복한다
		// stack에 데이터가 있으면 반복한다
		while( !stack.empty() ) {
			System.out.println( stack.pop() );
		}
		
		
	}

}
