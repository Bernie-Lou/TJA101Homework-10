package hw02;

public class OnetoTenGI {
	public static void main(String[] args) {
		int sum = 1;// 算乘積 總數從1開始乘
		for (int i = 1; i <= 10; i += 1 ) {
			sum *= i;//從1開始乘 小於10 每次加1 
		}
		System.out.println(sum);

	}
}