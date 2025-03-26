package hw02;

public class Ninenine_1 {
	public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {  // 外層 for 迴圈
            int j = 1;
            while (j <= 9) {  // 內層 while 迴圈
                System.out.print(i + " × " + j + " = " + (i * j) + "\t");
                j++;
            }
            System.out.println();
        }
    }
}