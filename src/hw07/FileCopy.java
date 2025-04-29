package hw07;

import java.io.*;

public class FileCopy{
   
    public static void copyFile(String sourceFilePath, String destinationFilePath) {
        try (
            FileInputStream fileInputStream = new FileInputStream(sourceFilePath); // 建立檔案輸入串流
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath) // 建立檔案輸出串流
        ) {
            byte[] buffer = new byte[1024]; // 緩衝區（buffer）大小先隨意給個1kb
            int bytesRead;

            // 使用 while 迴圈從輸入檔案讀取資料，並寫入到輸出檔案
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {//read 方法返回 -1 表示檔案末尾
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("檔案已成功複製！");

        } catch (IOException e) {
            System.out.println("檔案複製失敗: " + e.getMessage());
        }
    }

    /*public static void main(String[] args) {
        // 測試 copyFile 方法
        String sourceFile = "C:\\source.txt"; // 原始檔案路徑
        String destinationFile = "C:\\destination.txt"; // 目標檔案路徑

        copyFile(sourceFile, destinationFile); // 呼叫方法執行檔案複製
    }*/
}