package chapter02;

public class BattleExample {
	public static void main(String[] args) 
						throws Exception{
		boolean run = true;
		char keyCode = 0;

		while (run) {
			if (keyCode != '\r' && keyCode != '\n') {
				System.out.println("-----------------------------");
				System.out.println("1.가위 | 2.바위 | 3.보");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}

			keyCode = (char)System.in.read();
 
			// 컴퓨터의 선택 - 랜덤하게
			// int com = (int)(Math.random() * 3) + 1;
			char com = (char) ((int)(Math.random() * 3) + '1');
			
			// 승부 결정 - 이겼으면 종료, 졌으면 다시
			if(com =='1') {	// 컴 - 가위
				if(keyCode == '2') {
					System.out.println("이겼습니다.");
					run = false;
				}
				
			} else if(com == '2') {	// 컴 - 바위 
				if(keyCode == '3') {
					System.out.println("이겼습니다.");
					run = false;
				}
			} else  {	// 컴 - 보
				if(keyCode == '1') {
					System.out.println("이겼습니다.");
					run = false;
				}
			}
			if(!run) {
				System.out.println("이기지 못했습니다. 다시 합니다.");
			}
			
		}

		System.out.println("프로그램 종료");	
		
		
		
	}
}
