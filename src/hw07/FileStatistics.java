package hw07;

import java.io.*;

public class FileStatistics {
    public static void main(String[] args) throws IOException {
        // 檔案路徑
        String filePath = "C:\\Sample.txt";

        // 初始化計數變數
        int byteCount = 0;   // 位元組數
        int charCount = 0;   // 字元數
        int lineCount = 0;   // 行數

        // 計算位元組數量
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while (fileInputStream.read() != -1) {
            byteCount++;
        }
        fileInputStream.close(); //關閉 避免重複占用

        // 計算行數和字元數
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            lineCount++;               // 每讀一行，行數 +1
            charCount += line.length(); // 加上該行的字元數
        }
        reader.close();//關閉 避免重複占用

        // 輸出結果
        System.out.println("Sample.txt檔案共有:" + byteCount + "位元組，" + charCount + "個字元，" + lineCount + "列資料");

    }
}