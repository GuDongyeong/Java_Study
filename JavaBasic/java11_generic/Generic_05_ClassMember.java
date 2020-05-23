package java11_generic;

class Data<K> {
	K data;
}

class Class05<T> {
	Data d1; // raw type K -> Object
	
	Data<String> d2; // K -> String
	
	Data<T> d3; // K -> T
	
}

public class Generic_05_ClassMember {
	public static void main(String[] args) {
		
		// T -> Integer
		Class05<Integer> c05 = new Class05<>();
		c05.d3.data = 123; // NullPointerException d3 참조값인데 생성을 하지 않아서
	
		//--------------------------------------
		
		c05.d1 = new Data<>(); // Data<K> -> Data<Object>
		
		c05.d2 = new Data<>(); // Data<K> -> Data<String>
		
		c05.d3 = new Data<>(); // Data<K> -> Data<T> -> Data<Integer>
	
	
	
	
	}

}
