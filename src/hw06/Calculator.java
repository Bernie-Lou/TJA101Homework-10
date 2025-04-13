package hw06;

public class Calculator {

    // powerXY 方法可能會拋出 CalException
    public double powerXY(int x, int y) throws CalException {
        // 條件 1：x 和 y 同時為 0
        if (x == 0 && y == 0) {
            throw new CalException("x 與 y 不能同時為 0！");
        }

        // 計算次方
        double result = Math.pow(x, y);

        // 條件 2：y 為負，且結果不是整數（使用 %1 檢查是否為整數）
        if (y < 0 && result % 1 != 0) {
            throw new CalException("次方為負值,結果回傳不為整數!");
        }

        // 條件 3：正常結果
        return result;
    }
}

