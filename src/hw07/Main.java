package hw07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	 public static void main(String[] args) {
	        // 建立 Dog 和 Cat 物件
	        Dog dog1 = new Dog("Rex");
	        Dog dog2 = new Dog("Buddy");
	        Cat cat1 = new Cat("Whiskers");
	        Cat cat2 = new Cat("Mittens");

	        try {
	            // 準備序列化檔案的路徑
	            String directoryPath = "C:\\data";
	            String filePath = directoryPath + "\\Object.ser";

	            // 檢查資料夾是否存在，若不存在則建立
	            File directory = new File(directoryPath);
	            if (!directory.exists()) {
	                if (directory.mkdirs()) {
	                    System.out.println("資料夾 " + directoryPath + " 已成功建立！");
	                } else {
	                    System.out.println("資料夾 " + directoryPath + " 建立失敗！");
	                    return; // 如果無法建立資料夾，結束程式
	                }
	            }

	            // 將物件序列化並寫入檔案
	            FileOutputStream fileOut = new FileOutputStream(filePath);
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

	            objectOut.writeObject(dog1);
	            objectOut.writeObject(dog2);
	            objectOut.writeObject(cat1);
	            objectOut.writeObject(cat2);

	            objectOut.close();
	            fileOut.close();

	            System.out.println("物件已成功序列化到 " + filePath);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}