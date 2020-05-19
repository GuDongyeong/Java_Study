package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection08_Queue {
	public static void main(String[] args) {
		
		// DelayQueue 버퍼..
		// PriorityQueue 우선순위 먼저
		
		// Queue 인터페이스
		
		Queue queue = new LinkedList();
		
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Clare");
		queue.offer("Dave");
		
		System.out.println( queue );
		System.out.println( "크기 : " + queue.size() );
		
		System.out.println("---------------");
		
		System.out.println( queue.poll());
		System.out.println( queue.poll());
		System.out.println( queue.poll());
	
		System.out.println("---------------");
		
		System.out.println( queue.peek() );
		System.out.println( queue );
		System.out.println( "크기 : " + queue.size() );
		
	
	}

}
