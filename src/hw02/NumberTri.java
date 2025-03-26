package hw02;

public class NumberTri {
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) { // 外層迴圈控制行數（從 10 減少到 1）
			for (int j = 1; j <= i; j++) { // 內層迴圈輸出 1 到 i
				System.out.print(j + " ");
			}
			System.out.println(); // 換行
		}
	}
}


