package hw05;

public class MaxElementFinder {

    // 方法一：處理 int 二維陣列	
	public static int maxElement(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    // 方法二：處理 double 二維陣列
    public static double maxElement(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

   // 測試
    public static void main(String[] args) {
        int[][] intArray = {
            {1, 6, 3},
            {9, 5, 2}
        };
        double[][] doubleArray = {
            {1.2, 3.5, 2.2},
            {7.4, 2.1, 8.2}
        };

        System.out.println("int 最大值: " + maxElement(intArray));      
        System.out.println("double 最大值: " + maxElement(doubleArray)); 
    }
}
