package hw08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TrainProgram {
    public static void main(String[] args) {
        // 使用HashSet來儲存Train物件，因為HashSet會自動排除重複元素
        Set<Train> trainSet = new HashSet<>();
        
        // 建立Train物件並加入集合
        trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
        trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
        trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 這是重複項，應該不會被加入
        
        // 顯示集合大小，驗證是否有排除重複項
        System.out.println("集合中共有 " + trainSet.size() + " 個不重複的Train物件");
        
        // 方法1：使用Iterator印出所有Train物件
        System.out.println("\n方法1：使用Iterator");
        Iterator<Train> iterator = trainSet.iterator();
        while (iterator.hasNext()) {
            Train train = iterator.next();
            System.out.println(train);
        }
        
        // 方法2：使用傳統for迴圈印出所有Train物件
        System.out.println("\n方法2：使用傳統for迴圈");
        Train[] trainArray = trainSet.toArray(new Train[0]);
        for (int i = 0; i < trainArray.length; i++) {
            System.out.println(trainArray[i]);
        }
        
        // 方法3：使用foreach印出所有Train物件
        System.out.println("\n方法3：使用foreach");
        for (Train train : trainSet) {
            System.out.println(train);
        }
    }
}