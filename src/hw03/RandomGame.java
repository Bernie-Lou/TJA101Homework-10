package hw03;

import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		int i = (int) (Math.random() * 10 );
		// 進階 1~100 i = (int)(Math.random()*101);
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧:");
		int e = 0;
		while (sc.hasNextInt()) {
			e = sc.nextInt();
			if (e == i) {
				System.out.println("猜對了!答案就是" + e);
				break;
			}
			System.out.println("猜錯喽!");
		}

	}
}