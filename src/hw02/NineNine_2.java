package hw02;

public class NineNine_2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) { // 外層 for 迴圈
			int j = 1;
			do { // 內層 do while 迴圈
				System.out.print(i + " × " + j + " = " + (i * j) + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
	}
}
