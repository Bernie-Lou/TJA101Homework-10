package hw02;

public class OneToTenWhile {
	public static void main(String[] args) {
		int i = 1, sum = 1;//定義乘數和總數
		while (i <= 10) {// 乘數小於10
			sum*=i; i++;//乘數+1 乘被乘數 繼續乘
		}
		System.out.println(sum);
	}

}
