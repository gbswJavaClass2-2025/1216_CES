package exam02;

public class OrderItem {
    public Menu menu = new Menu();
    public int quantity;

    OrderItem(Menu menu, int quantity){
        this.menu = menu;
        this.quantity = quantity;
    }

    public int getPrice(){
        return menu.price * quantity;
    }
}
