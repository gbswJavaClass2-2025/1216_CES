package exam02;

public class OrderExample {
    public static void main(String[] args) {
        Menu chicken = new Menu("chicken", 20000);
        Menu pizza = new Menu("pizza", 13000);
        Menu  coke = new Menu("coke", 2000);
        OrderItem orderItem = new OrderItem(coke, 4);
        System.out.println(orderItem.getPrice());
    }
}