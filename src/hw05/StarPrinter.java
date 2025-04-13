package hw05;

import java.util.Scanner;

public class StarPrinter {
	public static void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) { // 控制行數（高度）
            for (int j = 0; j < width; j++) { // 控制每一行的字元數（寬度）
                System.out.print("*");
            }
            System.out.println(); // 換行
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("請輸入寬度：");
    int width = sc.nextInt();

    System.out.print("請輸入高度：");
    int height = sc.nextInt();

    starSquare(width, height); // 呼叫方法

    sc.close(); // 關閉 Scanner
}
}