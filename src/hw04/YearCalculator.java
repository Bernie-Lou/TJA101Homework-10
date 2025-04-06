package hw04;

import java.util.Scanner;

public class YearCalculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int year, month, day;
	        
	        // 輸入年份
	        System.out.print("請輸入西元年份(XXXX): ");
	        while (true) {
	            if (scanner.hasNextInt()) {
	                year = scanner.nextInt();
	                scanner.nextLine(); // 清除輸入緩衝區
	                
	                if (year > 0) {
	                    break;
	                } else {
	                    System.out.print("年份必須大於0，請重新輸入: ");
	                }
	            } else {
	                System.out.print("請輸入有效的數字: ");
	                scanner.nextLine(); // 清除無效輸入
	            }
	        }
	        
	        // 輸入月份
	        System.out.print("請輸入月份(1-12): ");
	        while (true) {
	            if (scanner.hasNextInt()) {
	                month = scanner.nextInt();
	                scanner.nextLine(); // 清除輸入緩衝區
	                
	                if (month >= 1 && month <= 12) {
	                    break;
	                } else {
	                    System.out.print("月份必須在1到12之間，請重新輸入: ");
	                }
	            } else {
	                System.out.print("請輸入有效的數字: ");
	                scanner.nextLine(); // 清除無效輸入
	            }
	        }
	        
	        // 取得該月的天數上限
	        int maxDays = getDaysInMonth(year, month);
	        
	        // 輸入日期
	        System.out.print("請輸入日期(1-" + maxDays + "): ");
	        while (true) {
	            if (scanner.hasNextInt()) {
	                day = scanner.nextInt();
	                scanner.nextLine(); // 清除輸入緩衝區
	                
	                if (day >= 1 && day <= maxDays) {
	                    break;
	                } else {
	                    System.out.print("日期必須在1到" + maxDays + "之間，請重新輸入: ");
	                }
	            } else {
	                System.out.print("請輸入有效的數字: ");
	                scanner.nextLine(); // 清除無效輸入
	            }
	        }
	        
	        // 計算是一年中的第幾天
	        int dayOfYear = calculateDayOfYear(year, month, day);
	        
	        System.out.println(year + "年" + month + "月" + day + "日是" + year + "年的第" + dayOfYear + "天");
	        
	        scanner.close();
	    }
	    
	    // 判斷是否為閏年
	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
	    
	    // 取得指定月份的天數
	    public static int getDaysInMonth(int year, int month) {
	        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        
	        if (month == 2 && isLeapYear(year)) {
	            return 29;
	        }
	        
	        return daysInMonth[month];
	    }
	    
	    // 計算是一年中的第幾天
	    public static int calculateDayOfYear(int year, int month, int day) {
	        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        
	        if (isLeapYear(year)) {
	            daysInMonth[2] = 29; // 閏年2月有29天
	        }
	        
	        int dayOfYear = day;
	        for (int i = 1; i < month; i++) {
	            dayOfYear += daysInMonth[i];
	        }
	        
	        return dayOfYear;
	    }
	}