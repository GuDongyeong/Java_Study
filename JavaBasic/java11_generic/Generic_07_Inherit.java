package java11_generic;

// ���׸� Ŭ����
class Parent<T>{
	T data;
}

class Child01 extends Parent { // T -> Object raw Type => Object data;
}

class Child02 extends Parent<String>{ // T -> String => String data;
}

class Child03<K> extends Parent<K>{ // T -> K
	// ��ӹ��� Ÿ���Ķ���͸� �����ϴ� ���� �̷��
}

class Child04<M, N> extends Parent<M>{
	N date2;
	
	// M data : ��ӹ��� ���׸� M�� �̿��� ����ʵ�,
	// N data2 : �ڽ�Ŭ������ ������ ���׸� N ����ʵ�, Ÿ�� �̰���
}


public class Generic_07_Inherit {
	public static void main(String[] args) {
		
		Child03<Integer> c = new Child03<>(); // T -> K -> Integer
		
		
	}
	

}
