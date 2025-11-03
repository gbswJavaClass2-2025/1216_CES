package exam06;

public class BankAccount {
    private String name;
    private String accountNumber;
    private int balance;
    private int count = 0;

    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    BankAccount(String name, String accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
        count++;
    }
    BankAccount(String name, String accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        count++;
    }

    public void withdrawal(int amount) {
        if(balance > amount) {
            System.out.println(amount + " 출금");
            balance -= amount;
        }
        else {
            System.out.println(balance +" 출금");
            balance = 0;
        }
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println("잔고 " + amount);
    }

    public int getCount(){
        return count;
    }
}
