package hw01;

public class Banktenyears {
	public static void main(String[] args) {
		double Fir = 1500000 , rate = 0.02;    // 定義開始金額150萬 年利率 2%
        int n = 10;         // 定義10 年
        double total = Fir * Math.pow((1+rate),n);// 找Google公式 複利算法
        System.out.println(total);
}
}