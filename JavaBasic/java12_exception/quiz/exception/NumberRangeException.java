package java12_exception.quiz.exception;

public class NumberRangeException extends RuntimeException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "1부터 100사이의 값이 아닙니다.";
	}
	
}
