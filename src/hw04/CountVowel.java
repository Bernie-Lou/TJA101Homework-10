package hw04;

public class CountVowel {
	 public static void main(String[] args) {
	        // 宣告行星名稱陣列
	        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
	        
	        // 計算所有行星名稱中的母音數量
	        int totalVowels = 0;
	        
	        // 遍歷每個行星名稱
	        for (String planet : planets) {
	            // 將字串轉為小寫，以便不分大小寫計算母音(有必要的話)
	            //planet = planet.toLowerCase();
	            
	            // 遍歷每個字元
	            for (int i = 0; i < planet.length(); i++) {
	                char c = planet.charAt(i);//字元比對  
	                
	                // 檢查是否為母音
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    totalVowels++;
	                }
	            }
	        }
	        
	        // 輸出結果
	        System.out.println("八大行星名稱中共有 " + totalVowels + " 個母音");
	        }
}

