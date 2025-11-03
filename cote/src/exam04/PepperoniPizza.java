package exam04;

public class PepperoniPizza extends Pizza{
    public String name = "Cheese Pizza";
    public int[] prices = {11000, 13000, 16000};
    public String toppings;

    PepperoniPizza(String size, String toppings) {
        super(size);
        this.toppings = toppings;
    }

    @Override
    public void cook(){
        System.out.println(toppings + "을 추가합니다.");
        System.out.println(name +" "+ size + "을 조리합니다.");
        System.out.println(name +" "+ size + "이 완성되었습니다.");
    }
}
