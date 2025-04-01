package hw3;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入整數:");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
		}
		System.out.println("請輸入整數:");
		if (sc.hasNextInt()) {
			b = sc.nextInt();
		}
		System.out.println("請輸入整數:");
		if (sc.hasNextInt()) {
			c = sc.nextInt();
		}
		if (a + b > c && a + c > b && b + c > a && a != 0 && b != 0 && c != 0) {
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b || b == c || c == a) {
				System.out.println("等腰三角形");
			} else if ((a * a + b * b) == c * c || (b * b + c * c) == a * a || (a * a + c * c) == b * b) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
		}
}
