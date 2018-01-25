package chapter02;

public class RandSumExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int sum_odd = 0; // È¦¼ö ÇÕ
		int sum_even = 0; // Â¦¼ö ÇÕ

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum_even += i;
			} else {
				sum_odd += i;
			}
		}

		System.out.println("1 ~ " + num + "¿¡¼­ È¦¼öÀÇ ÇÕ" + sum_odd);
		System.out.println("1 ~ " + num + "¿¡¼­ Â¦¼öÀÇ ÇÕ" + sum_even);
	}

}
