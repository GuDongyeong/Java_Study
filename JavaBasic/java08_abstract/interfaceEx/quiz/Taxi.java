package java08_abstract.interfaceEx.quiz;

public class Taxi implements Fare{

	@Override
	public void calc(int distance) {
		System.out.println(distance + "m를 운행했을 때 요금은 " + (Fare.FEE*distance*2) + "원 입니다");
																	//인터페이스 여러 개일 때 .으로 참조
	}
}
