package chapter02;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
		case 3:
		case 5:
			System.out.println(num + "�� Ȧ���Դϴ�.");
			break;
		case 2:
		case 4:		
		case 6:
			System.out.println(num + "�� ¦���Դϴ�.");
			break;
		}
	}

}
