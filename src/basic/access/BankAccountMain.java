package basic.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        //입금
        account.deposit(10000);
        //출금
        account.withdraw(7000);
        System.out.println("잔고: " + account.getBalance());
    }
}
