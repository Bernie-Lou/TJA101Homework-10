package hw3;

import java.util.Scanner;

public class AWen {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int disliked;

		// 讓使用者輸入討厭的數字
		System.out.println("阿文...請輸入你討厭哪個數字?");

		// 獲取有效輸入
		while (true) {
			if (scanner.hasNextInt()) {
				disliked = scanner.nextInt();
				if (disliked >= 0 && disliked <= 9) {
					break;
				} else {
					System.out.println("請輸入0到9之間的數字:");
				}
			} else {
				System.out.println("請輸入一個有效的數字:");
				scanner.next(); // 清除無效輸入
			}
		}
		// 顯示過濾後的數字並計算總數
		System.out.println("以下是不含數字 " + disliked + " 的數字:");
		int count = 0;
		int numbersInRow = 0;

		for (int i = 1; i <= 49; i++) {
			boolean containsDisliked = false;// 檢查數字是否包含討厭的數字
			int temp = i;
			if (temp == 0 && disliked == 0) {// 如果數字是0且討厭的數字也是0
				containsDisliked = true;
			}

			while (temp > 0) {// 檢查每一位數字
				if (temp % 10 == disliked) {
					containsDisliked = true;
					break;
				}
				temp /= 10;
			}

			if (!containsDisliked) {// 如果不包含討厭的數字，則顯示
				System.out.printf("%2d ", i);
				count++;
				numbersInRow++;

				if (numbersInRow == 6) {// 每行顯示6個數字
					System.out.println();
					numbersInRow = 0;
				}
			}
		}

		// 如果最後一行沒有滿6個數字，添加一個換行
		if (numbersInRow != 0) {
			System.out.println();
		}
		System.out.println("總共有 " + count + " 個數字被列出來");// 顯示總共有幾個數字

		scanner.close();

	}

}
