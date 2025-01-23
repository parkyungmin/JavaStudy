package basic.access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public 메서드: 입금
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //내부로직 - 입금액 검증
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    //인출
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("");
        }
    }
    
    //public 메서드 : 잔액조회
    public int getBalance() {
        return balance;
    }
}
