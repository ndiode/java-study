package chapter02;

public class Random {
	public static int getRand(int start, int end) {
		int range = end - start +1;
		int num = (int) (Math.random() * 6) + 1;
		return num;
	}
}
