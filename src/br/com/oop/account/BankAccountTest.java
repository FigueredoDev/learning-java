package src.br.com.oop.account;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setOwner("Figueredo");
        account.setNumber("0123456789");

        account.deposit(100);

        account.withdrawMoney(50);

        account.getBalance();
    }
}
