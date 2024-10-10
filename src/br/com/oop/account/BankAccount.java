package src.br.com.oop.account;

public class BankAccount {
    private String number;
    private String owner;
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    void deposit(double value) {
        if (value > 0) {
            this.balance += value;
            System.out.println("Deposit made successfuly. " + "The current balance is: " + this.balance);
        } else {
            System.out.println("The deposit value is invalid!");
        }
    }

    void withdrawMoney(double value) {
        if (value > 0 && value <= this.balance) {
            System.out.println("Withdraw value $ " + value + ". Balance $ " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }
}
