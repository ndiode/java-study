package chapter02;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m = 10; m >=1; m--) {
			for (int n = 1; n <= m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
