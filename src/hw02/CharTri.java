package hw02;

public class CharTri {
	public static void main(String[] args) {
		char letter = 'A'; // 從字母 A 開始
         for (int i = 1; i <=6; i++) { // 控制列數，從 1 到 6
			for (int j = 1; j <= i; j++) { // 內層迴圈負責輸出字母
				System.out.print(letter + " ");
			}
			System.out.println(); // 換行
			letter++; // 下一行的字母（A -> B -> C ...）
		}
	}
}