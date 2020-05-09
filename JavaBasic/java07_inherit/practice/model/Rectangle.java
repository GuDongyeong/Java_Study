package java07_inherit.practice.model;

public class Rectangle extends Point {

	private int width; //가로너비
	private int height; //세로높이
	
	//생성자
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		setWidth(width);
		setHeight(height);
	}
	
	//메소드
	public void draw() {
		double recArea = width * (double)height;
		double recCircum = 2 * (double)(width + height);
		
		super.draw();
		System.out.println("사각형 면적 : " + String.format("%.1f", recArea)
						+ "\n사각형 둘레 : " + String.format("%.1f", recCircum));
		System.out.println("-----------------");
	}
	
	
	//get set
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
