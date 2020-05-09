package java07_inherit.practice.model;

public class Circle extends Point {
	private int radius;
	
	//생성자
	public Circle() {
		this(0, 0, 0);
	}
	
	public Circle( int x, int y, int radius) {
		super(x, y);
		setRadius(radius);
	}
	
	
	//좌표값, 면적, 둘레 출력
	public void draw() {
		
		double cirArea = Math.PI * radius * radius;
		double cirCircum = 2 * Math.PI * radius;
		
		super.draw();
		System.out.println("원둘레 : " + String.format("%.1f", cirArea)
						+ "\n원면적 : "+ String.format("%.1f", cirCircum));
		System.out.println("-----------------");
	}
	
	
	//get set
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
