package chapter02;

public class TenByFiveExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 50) + 0;
		
		int sy = num / 10;
		int sx = num % 10;
		
		for(int y = 0; y < 5; y++) {
			for(int x = 0; x < 10; x++) {
				if( sy == y && sx == x)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}		
	}
}
