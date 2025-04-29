package hw08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrainQ3 {
    public static void main(String[] args) {
        // 建立一組 Train 物件資料，並以班次編號由大到小排序且不重複
        Set<Train> trains = new TreeSet<>((t1, t2) -> {
            if (t1.getNumber() != t2.getNumber()) {
                return t2.getNumber() - t1.getNumber(); // 班次編號由大到小排序
            } else {
                return t1.hashCode() - t2.hashCode(); // 確保 TreeSet 支援不重複性
            }
        });
        trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trains.add(new Train(118, "自強", "高雄", "台北", 500));
        trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trains.add(new Train(122, "自強", "台中", "花蓮", 600));
        trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));//重複的火車
        
        System.out.println("使用 Iterator 印出：");
        Iterator<Train> iterator = trains.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\n使用傳統 for 迴圈印出：");
        Train[] trainArray = trains.toArray(new Train[0]);
        for (int i = 0; i < trainArray.length; i++) {
            System.out.println(trainArray[i]);
        }
        
        System.out.println("\n使用 foreach 迴圈印出：");
        for (Train train : trains) {
            System.out.println(train);
        }
    }
}