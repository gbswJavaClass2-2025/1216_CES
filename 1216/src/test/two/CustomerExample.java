package test.two;

public class CustomerExample {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer("customer","010-1234-1234", 10000);


        System.out.println(cust1.addPoint(1000));
        System.out.println(cust2.usePoint(500));
        System.out.println(cust2.addPoint(2000));
    }
}
