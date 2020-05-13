package java09_api;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {
		
	//가위바위보 게임 만들기
	
	// int user : 사용자 입력
	// int com : 컴퓨터 랜덤 (1~3)
	
		Scanner sc = new Scanner(System.in);
		
		//1. 가위 2. 바위 3 보
		
		// 컴퓨터 입력
		Random ran = new Random();
		
		int user;
		int com;
		
//		do {
//		
//		
//		com = ran.nextInt(3) + 1; // 1~3
//		System.out.println( com );
//		
//		
//		// 사용자 입력
//		System.out.println("**** 가위바위보 게임 ****");
//		System.out.println("1 : 가위\t2 : 바위\t3 : 보\t4 : 종료");
//		System.out.print(">> ");
//		
//		user = sc.nextInt();
//		
//		if( com == user ) {
//				System.out.println("비겼습니다");
//		}
//		
//		//컴 가위
//		if( com == 1 && user == 2) {
//			System.out.println(">> user WIN");
//		}	
//		if( com == 1 && user == 3) {
//				System.out.println(">> user LOSE");
//		}
//		
//		//컴 바위
//		if( com == 2 && user == 1) {
//			System.out.println(">> user LOSE");
//		}
//		
//		if( com == 2 && user == 3) {
//			System.out.println(">> user WIN");
//		}
//		
//		//컴 보
//		if( com == 3 && user == 1) {
//			System.out.println(">> user WIN");
//		}
//
//		if( com == 3 && user == 2) {
//			System.out.println(">> user LOSE");
//		}
//		
//		System.out.println();
//		
//		}while( user != 4 );
//		
//		System.out.println(">> 종료되었습니다 <<");
		
		int res;
		
		do {
			
			com = (int)(Math.random()*3) + 1;
			
			System.out.println("****************** 가위바위보 게임 ******************");
			System.out.println("1 : 가위\t2 : 바위\t3 : 보\t4 : 종료");
			System.out.print(">> ");
			
			user = sc.nextInt();
			
			System.out.println("com : " + com);
			System.out.println("user : " + user);
			
			
			if(user<1 || user>4 ) {
				System.out.println("잘못된 메뉴입니다\n");
				continue;
			}
			
			res = com-user;
			
			if(res == 0) {
				System.out.println("Draw");
			}
			
			else if( res == -1 || res == 2) {
				System.out.println("user WIN");
			}
			
			else if( res == 1 || res == -2) {
				System.out.println("user LOSE");
			}
		
			System.out.println("******************************************************");
			System.out.println();
			
		}while( user != 4 );
		
		System.out.println(">> 종료 <<");
		
	}
}
