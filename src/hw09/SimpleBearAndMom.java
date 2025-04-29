package hw09;

class BankAccount {
    private int balance = 0; // 帳戶餘額

    synchronized public void deposit(int amount) {
        while (balance >= 3000) {
            System.out.println("媽媽看到帳戶餘額超過3000元，暫停匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        System.out.println("媽媽匯款：" + amount + "元；帳戶餘額：" + balance + "元");
        notify();
    }

    synchronized public void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("熊大發現帳戶餘額不足，暫停提款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("熊大提款：" + amount + "元；帳戶餘額：" + balance + "元");
        
        if (balance < 2000) {
            System.out.println("熊大發現帳戶餘額低於2000元，請求媽媽匯款");
            notify();
        }
    }
}

class Mother extends Thread {
    BankAccount account;
    
    public Mother(BankAccount account) {
        this.account = account;
    }
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep((int)(Math.random() * 1000) + 500); // 隨機暫停0.5~1.5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(2000); // 每次匯款2000元
        }
    }
}

class Bear extends Thread {
    BankAccount account;
    
    public Bear(BankAccount account) {
        this.account = account;
    }
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep((int)(Math.random() * 1500) + 1000); // 隨機暫停1~2.5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(1000); // 每次提款1000元
        }
    }
}

public class SimpleBearAndMom {
    public static void main(String[] args) {
        System.out.println("=== 熊大與媽媽的匯款提款模擬開始 ===");
        BankAccount account = new BankAccount();
        Mother mother = new Mother(account);
        Bear bear = new Bear(account);
        
        mother.start();
        bear.start();
        
        // 等待兩個執行緒結束
        try {
            mother.join();
            bear.join();
            System.out.println("=== 熊大與媽媽的匯款提款模擬結束 ===");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}