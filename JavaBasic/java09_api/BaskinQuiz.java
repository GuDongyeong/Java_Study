package java09_api;

import java.util.Random;
import java.util.Scanner;

public class BaskinQuiz {
	public static void main(String[] args) {
		
	
//	 + 배스킨라빈스31 게임
//	  - 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
//	  - 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
//	   말할 수 있다
//	  - 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
//	  - 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
//	  - 31을 말하는 사람이 진다
//
//
//
//	  * 추가 사항
//		 31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
//		있는 숫자까지만 말한다
//
//		ex. 사용자가 29까지 말했다면
//		  컴퓨터는 무조건 30까지만 말한다
	
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	int com;
	int user;
	int cnt = 0;
		
	
		while( true ) {
		
			com = ran.nextInt(3)+1;//1~3
			if(cnt == 27) { com = 3; } 
			if(cnt == 28) { com = 2; } 
			if(cnt == 29) { com = 1; } 
			
			System.out.println( "com : " + com );
			
			System.out.println("\n>> com");
			for(int i=0;i<com;i++) {
				
				System.out.println(++cnt);
	
			}
			
			if(cnt>=31) {
				System.out.println("user WIN");
				break;
			}
			
			System.out.print("몇 개의 숫자를 말하시겠습니까? (1~3) \t>");
			
			user = sc.nextInt();
			
			for(int i=0;i<user;i++) {
				System.out.println(++cnt);
			}
			
			
			if(cnt>=31) {
				System.out.println("user LOSE");
				break;
			}
			
		}
	
	
	
	}

}
