package hw09;

import java.util.Random;

public class BigStomachKing implements Runnable {
	 private String name; // 選手名稱
	    private int bowlsToEat = 10; // 需要吃的碗數
	    private Random random = new Random(); // 用於產生隨機數
	public BigStomachKing(String name) {
		this.name = name;
	}
	public void run() {
        for (int i = 1; i <= bowlsToEat; i++) {
            try {
                // 隨機產生500-3000毫秒的暫停時間
                int sleepTime = random.nextInt(2501) + 500;
                
                System.out.println(name + " 正在吃第 " + i + " 碗飯...");
                Thread.sleep(sleepTime); // 暫停隨機時間
                System.out.println(name + " 已經吃完第 " + i + " 碗飯!");
                
                // 在碗與碗之間稍微休息
                Thread.sleep(300);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // 比賽結束
        System.out.println(name + " 已經吃完所有10碗飯，完成比賽!");
    }
    
    public static void main(String[] args) {
        // 建立兩位選手的Runnable物件
    	BigStomachKing mantou = new BigStomachKing("饅頭人");
    	BigStomachKing james = new BigStomachKing("詹姆士");
        
        // 由Runnable物件產生執行緒Thread物件
        Thread mantouThread = new Thread(mantou);
        Thread jamesThread = new Thread(james);
        
        // 顯示比賽開始
        System.out.println("==== 大胃王比賽開始! ====");
        
        // 啟動執行緒，開始比賽
        mantouThread.start();
        jamesThread.start();
        
        // 等待兩個執行緒結束
        try {
            mantouThread.join();
            jamesThread.join();
            System.out.println("==== 大胃王比賽結束! ====");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}