package hw04;

import java.util.Scanner;

public class EmployeeMoneyFilter {
	public static void main(String[] args) {
        // 定義員工ID和對應的金額陣列
        int[] employeeIds = {25, 32, 8, 19, 27};
        int[] moneyAmounts = {2500, 800, 500, 1000, 1200};
                      
        // 創建Scanner物件以接收用戶輸入
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個金額數字作為篩選條件: ");
        
        // 檢查輸入是否為整數
        if (scanner.hasNextInt()) {
            int threshold = scanner.nextInt();
            
            // 計算符合條件的員工數量
            int count = 0;
            for (int amount : moneyAmounts) {
                if (amount > threshold) {
                    count++;
                }
            }
            
            // 顯示符合條件的員工數量
            System.out.println("持有金額大於 " + threshold + " 的員工數量為: " + count);
            
            // 顯示符合條件的員工ID和金額
            System.out.println("符合條件的員工清單:");
            for (int i = 0; i < employeeIds.length; i++) {
                if (moneyAmounts[i] > threshold) {
                    System.out.println("員工ID: " + employeeIds[i] + ", 持有金額: " + moneyAmounts[i]);
                }
            }
        } else {
            System.out.println("輸入錯誤");
        }
        
        // 關閉Scanner
        scanner.close();
    }
}
