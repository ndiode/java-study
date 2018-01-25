package chapter02;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
		case 3:
		case 5:
			System.out.println(num + "은 홀수입니다.");
			break;
		case 2:
		case 4:		
		case 6:
			System.out.println(num + "은 짝수입니다.");
			break;
		}
	}

}
