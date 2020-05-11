package java08_abstract.interfaceEx.quiz;

public interface Fare {

	public static final int FEE = 3; // 비용
	
	//요금 계산 및 출력
	public abstract void calc(int distance);
	
}
