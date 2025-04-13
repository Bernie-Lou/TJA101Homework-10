package hw06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            // 輸入 x
            System.out.print("請輸入 x 的值：");
            int x = scanner.nextInt();

            // 輸入 y
            System.out.print("請輸入 y 的值：");
            int y = scanner.nextInt();

            // 呼叫 powerXY 並顯示結果
            double result = calculator.powerXY(x, y);
            System.out.println(x + " 的 " + y + " 次方為: " + result);

        } catch (InputMismatchException e) {
            System.out.println("輸入格式不正確！");
        } catch (CalException e) {
            System.out.println("錯誤：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("發生其他錯誤：" + e.getMessage());
        } finally {
            scanner.close(); // 關閉 Scanner
        }
    }
}
