package java08_abstract.interfaceEx.quiz2;

public class ArrayPractice implements ArrayAction {
	
	String[] arr = new String[10];
	
	
	
	@Override
	public void add(String element) {
		int idx = 0; //삽입 위치
		
		
		for(;idx<arr.length;idx++) {
			
			if(arr[idx] == null) {
				break;
			}
		}
		
		if(idx == arr.length ) {
			System.out.println("더 이상 공간이 없습니다");
			return;
		}
		
		arr[idx] = element;
		
	}
	
	
	@Override
	public int find(String element) {
		int idx=0;//위치 인덱스		
		
		for(;idx<arr.length;idx++) {
			
			if(arr[idx] == element) {
				break;
			}
		}
		
		if(idx == arr.length) {
			return -1;
		}
		
		return idx;
		
	}
	
	
	@Override
	public String get(int idx) {

		return arr[idx];
	}
	
	
	@Override
	public void print() {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null)
				System.out.println(arr[i]);
			
			else break;
			
		}
	}
	
	
	@Override
	public void remove(String element) {

		int idx = find(element);
		
		if(idx == -1) {
			System.out.println("[Error] 존재하지 않는 요소");
		}
		
		else if(idx == arr.length-1) {
			arr[idx] = null;
		}
		
		else {
			for(int i=idx;i<arr.length-1;i++) {
				
				arr[i] = arr[i+1];
				
				if(arr[i+1] == null || i+1 == arr.length-1) {
					arr[i+1] = null;
					break;
				}
					
			}
		}
	}
		
}
	


