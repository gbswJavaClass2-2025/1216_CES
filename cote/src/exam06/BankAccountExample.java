package exam06;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("최은수의 계좌", "134-1234-1234");

        b.deposit(10000);
        b.withdrawal(5000);
        b.withdrawal(6000);

//        System.out.println(b.getCount());
    }
}
