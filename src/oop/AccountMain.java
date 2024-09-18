package oop;

public class AccountMain {
    public void main(String[] args) {
        Account account = new Account();
        account.deposit(10000); // 입금
        account.withdraw(9000); // 출금
        account.withdraw(4000);
        System.out.println("잔고:" + account.balance);

    }

}
