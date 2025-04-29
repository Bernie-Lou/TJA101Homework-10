package hw07;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class AppendRandomNumbers {
    public static void main(String[] args) throws Exception {//可能出現的意外
        // 顯示當前工作目錄
        System.out.println("工作目錄: " + System.getProperty("user.dir"));//確認程式是否成功

        // 檔案名稱
        String fileName = "Data.txt";

        // 產生亂數並寫入檔案  Append 模式
        Random random = new Random();
        FileWriter fileWriter = new FileWriter(fileName, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1000) + 1;
            printWriter.println(randomNumber);
        }
        printWriter.close();//建立習慣 用完關起來

        System.out.println("檔案寫入完成: " + fileName);//告知用
    }
}