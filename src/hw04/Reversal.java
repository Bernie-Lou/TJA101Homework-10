package hw04;

public class Reversal {
	public static void main(String[] args) {
        
        String s = "happy";
            
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();//使用reverse方法
        System.out.println(reversed);
	}
}
