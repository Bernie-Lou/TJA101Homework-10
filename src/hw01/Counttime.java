package hw01;

public class Counttime {
	
	public static void main(String[] args) {
        int totalSeconds = 256559;//定義總秒數

        System.out.println(
            + (totalSeconds / 86400) + " 天 "  // 計算天數
            + (totalSeconds % 86400 / 3600) + " 小時 "  // 計算小時
            + (totalSeconds % 3600 / 60) + " 分 "  // 計算分鐘
            + (totalSeconds % 60) + " 秒"  // 計算秒數
        );
    }
}


