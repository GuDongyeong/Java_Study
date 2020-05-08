package java07_inherit.product;

//추상클래스
public abstract class Product {//생성자 호출이 되지 않음 추상클래스이므로
	protected String model;
	protected int price;
	
	public Product(String model, int price) {
		setModel(model);
		setPrice(price);
	}

	//추상메소드 : 직접 구현하지 않고 오버라이딩한 메소드가 채우도록
	public abstract void out();
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
