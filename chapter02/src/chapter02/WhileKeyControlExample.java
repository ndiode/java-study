package chapter02;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {

		boolean run = true;
		int speed = 0;
		char keyCode = 0;

		while (run) {
			if (keyCode != '\r' && keyCode != '\n') {
				System.out.println("-----------------------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("-----------------------------");
				System.out.print("����: ");
			}

			keyCode = (char)System.in.read();
			
			if (keyCode == '1') { // 1
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == '2') { // 2
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == '3') { // 3
				run = false;
			}
		}

		System.out.println("���α׷� ����");
	}
}
