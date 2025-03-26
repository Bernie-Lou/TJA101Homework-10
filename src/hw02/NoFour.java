package hw02;

public class NoFour {
	public static void main(String[] args) {
		int count = 0;// 從0開始數
		for (int i = 1; i <= 39; i++) {//數1~39
			if (i % 10 != 4) { // 檢查數字是否包含 4
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.print("總共"+count+"個");
	}
}