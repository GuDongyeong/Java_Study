package java11_generic;

// 멀티 제네릭 클래스
class Class04<T1, T2>{
	
	private T1 data1;
	private T2 data2;
	
	
	// 멀티 제네릭 메소드
	public <K1, K2> K2 test(K1 data) {
		K2 result = (K2) data;
		
		return result;
	}
	
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
}



public class Generic_04_MultiGeneric {
	public static void main(String[] args) {
		
		//제네릭 클래스
		Class04<Integer, String> c04 = new Class04<>(); // 멀티 제네릭 클래스의 경우 타입파라미터 하나만 넣으면 에러가 난다
		
		c04.setData1(123);
		c04.setData2("abc");
		
		//------------------------------------------
		
		//제네릭 메소드
		c04.<Boolean, Double>test(true);
		c04.<Integer, Double>test(123);
		
		
		
		
		
		
		
	}
	

}
