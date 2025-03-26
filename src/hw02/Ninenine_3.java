package hw02;

public class Ninenine_3 {
	public static void main(String[] args) {
        int i = 1;
        while (i <= 9) {  // 外層 while 迴圈
            int j = 1;
            do {  // 內層 do while 迴圈
                System.out.print(i + " × " + j + " = " + (i * j) + "\t");
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        }
    }
}