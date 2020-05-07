package java07_inherit;

class Parent {
	String name;
	int num;
	
	public void display() {
		System.out.println("부모 클래스의 메소드");
	}
	
}

class Child extends Parent {
	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
		
	public void display() {
		System.out.println("메소드 재정의, 오버라이딩");
	}
		
}

public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.num = 123;
		
		p.display();
		
		System.out.println("---------------------------");
		
		Child c = new Child();
		
		c.name = "Bod";
		c.num = 444;
		c.score = 5555;
		
		c.display();
		c.print();
	}
	
}
