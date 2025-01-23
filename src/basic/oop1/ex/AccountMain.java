package basic.oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        //입금
        account.deposit(10000);
        //출금
        account.withdraw(9000);
        //출금시도
        account.withdraw(2000);

        //잔고 확인
        int balance = account.checkBalance();
        System.out.println("잔고: " + balance);
    }
}
