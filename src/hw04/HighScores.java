package hw04;

public class HighScores {
	  public static void main(String[] args) {
	        int[][] scores = {
	            {10, 37, 100, 77, 98, 90},
	            {35, 75, 70, 95, 70, 80},
	            {40, 77, 79, 70, 89, 100},
	            {100, 89, 90, 89, 90, 75},
	            {90, 64, 75, 60, 75, 50},
	            {85, 75, 70, 75, 90, 20},
	            {75, 70, 79, 85, 89, 99},
	            {70, 95, 90, 89, 90, 75}
	        };
	        
	        // 計算每位學生的最高分次數
	        int[] highestScoreCount = new int[8]; // 8位學生
	        
	        // 遍歷每次考試(6次)
	        for (int j = 0; j < 6; j++) {
	            // 找出本次考試的最高分
	            int maxScore = -1;
	            for (int i = 0; i < 8; i++) {
	                if (scores[i][j] > maxScore) {
	                    maxScore = scores[i][j];
	                }
	            }
	            
	            // 確認哪些學生獲得最高分
	            for (int i = 0; i < 8; i++) {
	                if (scores[i][j] == maxScore) {
	                    highestScoreCount[i]++;
	                }
	            }
	        }
	        for (int i = 0; i < highestScoreCount.length; i++) {
	            System.out.println((i + 1) + " 號: " + highestScoreCount[i] + " 次");
	        }
	    }
	}
