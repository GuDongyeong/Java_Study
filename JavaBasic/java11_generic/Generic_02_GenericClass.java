package java11_generic;

//class Class02_int{
//	
//	private int data;
//	
//	public int display(int data) {
//		this.data = data;
//		return data;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//}

//class Class02_double{
//	
//	private double data;
//	
//	public double display(double data) {
//		this.data = data;
//		return data;
//	}
//	
//	public double getData() {
//		return data;
//	}
//	
//	public void setData(double data) {
//		this.data = data;
//	}
//}

//���׸� Ŭ����
class Class02<T>{
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class Generic_02_GenericClass {
	public static void main(String[] args) {
		
		// T -> String 
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		String fruit = c02.getData();
		
		System.out.println("���� : " + fruit);
		
		//----------------------------------
		
		// T -> Integer
		
		Class02<Integer> c02_1 = new Class02<>();
		
		
		
		
	}

}
