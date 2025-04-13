package hw05;

public class RandomAverage {

    public static void randAvg() {
        int sum = 0;

        System.out.print("本次亂數結果：");

        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 101); // 產生 0～100 的數字
            System.out.print(num + " ");
            sum += num;
        }

        double avg = sum / 10.0; // 平均值  可能為小數
        System.out.println("\n平均值：" + avg);
    }

 // 測試
    public static void main(String[] args) {
        randAvg();
    }
}