package hw07;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PetReader {
    public static void main(String[] args) {
        String filePath = "C:\\data\\Object.ser";

        try (
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn)
        ) {
            // 讀取並反序列化四個物件
            Object obj1 = objectIn.readObject();
            Object obj2 = objectIn.readObject();
            Object obj3 = objectIn.readObject();
            Object obj4 = objectIn.readObject();

            // 使用多型簡化處理，執行每個物件的 speak() 方法
            if (obj1 instanceof Speakable) {
                ((Speakable) obj1).speak();
            }
            if (obj2 instanceof Speakable) {
                ((Speakable) obj2).speak();
            }
            if (obj3 instanceof Speakable) {
                ((Speakable) obj3).speak();
            }
            if (obj4 instanceof Speakable) {
                ((Speakable) obj4).speak();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
