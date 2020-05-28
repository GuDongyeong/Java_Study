package java12_exception.quiz;

import java12_exception.quiz.exception.CharCheckException;

public class CharacterProcess {
	public CharacterProcess() {}
	
	public int countAlpha(String s) throws CharCheckException {
	
		int cnt=0;
		
		for( int i=0;i<s.length();i++) {
			
			if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i)){
				cnt++;
			}
		}
		
		System.out.println("공백문자 수 : " + cnt);
		
		if( cnt == 0) {
			int n = s.length();
			return n;
		}else {
			throw new CharCheckException();
		}
		
	}

}
