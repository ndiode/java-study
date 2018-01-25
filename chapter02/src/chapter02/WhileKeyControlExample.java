package chapter02;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {

		boolean run = true;
		int speed = 0;
		char keyCode = 0;

		while (run) {
			if (keyCode != '\r' && keyCode != '\n') {
				System.out.println("-----------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}

			keyCode = (char)System.in.read();
			
			if (keyCode == '1') { // 1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == '2') { // 2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == '3') { // 3
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}
