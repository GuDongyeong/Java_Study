package java09_api.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java06_class.method.quiz.Calculator;
import sun.util.calendar.Gregorian;

public class TimeEx {
	public static void main(String[] args) {
		
		// Date Class
		//java.util.Date
		
		Date dToday = new Date(); // Date객체 생성 - 현재 날짜/시간 입력됨
		System.out.println( dToday ); //Date객체 출력
		
		Date dToday2 = new Date(0L); //long타입 상수이므로 뒤에 L넣어줘야한다
		System.out.println( dToday2 );
		// Thu Jan 01 09:00:00 KST 1970 표준시가 다르기 때문에
		
		// 추가 메소드 대부분이 deprecated 되어 있음
		
		// java.util.Date 클래스의 세부 정보(날짜/시간)를 파악하려면 Calendar 클래스의 get()메소드를 사용해야 한다
		
		System.out.println("------------------------------");
		
		// java.util.Calendar Class
		Calendar cToday = Calendar.getInstance(); // 하드웨어 클럭을 가져오는 과정에서 보안 문제 - 자바가 객체를 생성해주는 메소드로 제공
		
		//Calendar 자체는 추상클래스이기 때문에 자식클래스가 출력된다 
		System.out.println(cToday);// 객체 정보 전체가 출력
		
		System.out.println(cToday.get( Calendar.YEAR )); // 년도
		System.out.println(cToday.get( Calendar.MONTH )); // 월(0 : 1월)
		System.out.println(cToday.get( Calendar.DATE)); // 일
		
		System.out.println(cToday.get( Calendar.HOUR )); // 12시간 기준시
		System.out.println(cToday.get( Calendar.HOUR_OF_DAY )); // 24시간 기준시
		System.out.println(cToday.get( Calendar.MINUTE )); // 분
		System.out.println(cToday.get( Calendar.SECOND )); // 초
		
		System.out.println("-----------------------------------");
		
		// GregorianCalendar Class
		
		GregorianCalendar gToday = new GregorianCalendar(1994, 4, 6, 20, 7, 9); //내가 넣고 싶은 날짜값을 넣을 수 있다 년 월 일 시 분 초
		
		
		System.out.println( gToday );
		
		// Calendar 와 같은 방법으로 추출, 차이점은 그레고리력은 객체를 생성할 수 있다는 것
		System.out.println(gToday.get( Calendar.YEAR )); // 년도
		System.out.println(gToday.get( Calendar.MONTH )); // 월(0 : 1월)
		System.out.println(gToday.get( Calendar.DATE)); // 일
		
		System.out.println(gToday.get( Calendar.HOUR )); // 12시간 기준시
		System.out.println(gToday.get( Calendar.HOUR_OF_DAY )); // 24시간 기준시
		System.out.println(gToday.get( Calendar.MINUTE )); // 분
		System.out.println(gToday.get( Calendar.SECOND )); // 초
		
		System.out.println("-----------------------------------");
		
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); //Date -> Calendar 적용
		
		System.out.println(cal);
		
		// ------------------------
		
		GregorianCalendar greCal = new GregorianCalendar();
		greCal.setTime(now);
		
		Date res1 = cal.getTime(); // Calendar -> Date
		Date res2 = greCal.getTime(); // GregorianCalendar -> Date
		
		System.out.println(res1);
		
		
		
		
	}

}
