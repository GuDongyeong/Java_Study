package java07_inherit.practice.model;

public class Point {
	protected int x;
	protected int y;
	
	//생성자
	public Point() {
		this(0,  0);//기본값
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	// 좌표값 출력
	public void draw() {
		System.out.println("좌표값 = ("+ x + ", "+ y + ")");
	}
	
	//get set
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
