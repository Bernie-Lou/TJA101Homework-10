package hw06;

public class CalException extends Exception {

    // 建構子：可以讓我們自訂錯誤訊息
    public CalException(String message) {
        super(message);
    }
}
