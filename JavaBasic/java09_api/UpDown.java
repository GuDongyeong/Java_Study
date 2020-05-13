package java09_api;

import java.util.Scanner;

public class UpDown {
	
	public static final int GAMECOUNT = 7;
	
	public static void main(String[] args) {
		
		int com = (int)(Math.random()*50 + 1);
		System.out.println( "com : " + com );
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 1;
		
		while(true) {
			
			System.out.print("\n" + (cnt) + " > Input Number(1~50) : ");
			int user = sc.nextInt();
			
			
			if(user>50 || user<1) {
				System.out.println("[Error] : 1~50 까지의 수 중에 고르시오");
				continue;
			}
			
			
			if( com == user ) {
				System.out.println( "User Win" );
				break;
			}else if( com > user ) {
				System.out.println( "Up" );
			}else if( com < user ) {
				System.out.println( "Down" );
			}

			
			if( cnt==GAMECOUNT ) {
				System.out.println("User Lose");
				System.out.println("[com] " + com );
				break;
			}
			
			System.out.println("[남은 횟수] " + (GAMECOUNT-cnt) + "회");
			
			cnt++;
		}
	}
}
