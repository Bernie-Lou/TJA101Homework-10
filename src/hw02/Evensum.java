package hw02;

public class Evensum {
	public static void main(String[] args) {
		int sum = 0;//從零開始
    for (int i = 2; i <= 1000; i += 2) {// 找偶數出來
    	sum += i;//找到加上去  回去繼續找
    }

	System.out.println(sum);
}
}
