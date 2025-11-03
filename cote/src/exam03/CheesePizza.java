package exam03;

public class CheesePizza {
    public String name = "Cheese Pizza";
    public int[] prices = {12000, 15000, 19000};
    public String size = "M";
    public int listNum = 1;

    CheesePizza(){}
    CheesePizza(String size){
        this.size = size;
        if(size == "S"){
            this.listNum = 0;
        } else if (size == "L") {
            this.listNum = 2;
        }
    }

    public void cook(){
        System.out.println(name +" "+ size + "을 조리합니다.");
        System.out.println(name +" "+ size + "이 완성되었습니다.");
    }
    public void serve(){
        System.out.println(name +" "+ size + "를 드립니다." + prices[listNum] + "입니다.");
    }
}
