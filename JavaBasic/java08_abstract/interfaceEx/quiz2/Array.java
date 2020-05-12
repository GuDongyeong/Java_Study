package java08_abstract.interfaceEx.quiz2;

import java.util.Scanner;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	
	int count = 0;
	
	@Override
	public void add(String element) {
		
		for(int i=0;i<count+1;i++) {
			if(arr[i] == element) {
				System.out.println("요소가 이미 존재합니다");
				return;
			}
		}
		arr[count++] = element;
	}
	
	@Override
	public void remove(String element) {
		

		
		for(int i=0;i<count;i++) {
			if(arr[i] == element ) {

				for(int j=i;j<count-1;j++) {
					arr[j] = arr[j+1];
				}
				
				arr[--count] = null;
				continue;
			}
		}
		
		
		
	
//		int idx=10;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==element) {
//				arr[i] = null;
//				idx = i;
//				count--;
//				continue;
//				
//			}else if(i>idx){
//				arr[i-1] = arr[i];
//			}
//			
//			
//		}
		
	}
		
	
	
	@Override
	public String get(int idx) {
		
		return arr[idx];
	}
	

	@Override
	public int find(String element) {
		
		for(int i=0;i<count;i++) {
			if( arr[i] == element )
				return i;
		}
		return -1;
	}
	
	@Override
	public void print() {
		
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
