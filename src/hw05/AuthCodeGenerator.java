package hw05;

public class AuthCodeGenerator {

    // 產生隨機驗證碼的方法
    public static String getAuthCode() {
        StringBuilder charsBuilder = new StringBuilder();
        // .append方法  把需要的三個範圍串進池子中
        // 小寫 a-z
        for (char c = 'a'; c <= 'z'; c++) {
            charsBuilder.append(c);
        }

        // 大寫 A-Z
        for (char c = 'A'; c <= 'Z'; c++) {
            charsBuilder.append(c);
        }

        // 數字 0-9
        for (char c = '0'; c <= '9'; c++) {
            charsBuilder.append(c);
        }

        String chars = charsBuilder.toString();

        // 隨機組成 8 位驗證碼
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.length()); // 隨機方法  長度方法
            code.append(chars.charAt(index));//   加到 code 裡(從字串 chars 抓出 index 對應的字元)
            
        }

        return code.toString();
    }

    // 測試
    public static void main(String[] args) {
        String code = getAuthCode();
        System.out.println("產生的驗證碼是: " + code);
    }
}

