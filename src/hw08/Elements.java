package hw08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Elements {
	public static void main(String[] args) {
		// 建立Collection物件並加入資料
		Collection<Object> collection = new ArrayList<>();
		collection.add(Integer.valueOf(100));
		collection.add(Double.valueOf(3.14));
		collection.add(Long.valueOf(21L));
		collection.add(Short.valueOf("100"));
		collection.add(Double.valueOf(5.1));
		collection.add("Kitty");
		collection.add(Integer.valueOf(100));
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger("1000"));

		// 第一種方法：使用Iterator
		System.out.println("方法一：使用Iterator");
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println(element);
		}

		// 第二種方法：使用傳統for迴圈（需先轉換為陣列或List）
		System.out.println("\n方法二：使用傳統for迴圈");
		Object[] array = collection.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 第三種方法：使用foreach (enhanced for loop)
		System.out.println("\n方法三：使用foreach");
		for (Object element : collection) {
			System.out.println(element);
		}

		// 使用Iterator移除非Number相關的物件
		Iterator<Object> iterator1 = collection.iterator();
		while (iterator1.hasNext()) {
			Object element = iterator1.next();
			if (!(element instanceof Number)) {
				iterator1.remove();
			}
		}
		  // 印出移除後的集合
        System.out.println("\n移除非Number相關物件後的集合內容：");
        for (Object element : collection) {
            System.out.println(element + " (類型: " + element.getClass().getName() + ")");
        }
	}
}