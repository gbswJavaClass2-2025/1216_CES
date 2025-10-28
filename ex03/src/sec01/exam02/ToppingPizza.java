package sec01.exam02;

public class ToppingPizza extends Pizza{
    // 필드
    public String topping;

    // 생성자
    public ToppingPizza(){}
    public ToppingPizza(String dough, int sizeInInch, String pizzaName, String topping){
        System.out.println(">>Pizza 객체 생성: " + dough + " " + sizeInInch + "인치 피자");
        this.dough = dough;
        this.sizeInInch = sizeInInch;
        this.pizzaName = pizzaName;
        this.topping = topping;
    }

    // 메서드
    @Override
    public void describe(){
        System.out.println(pizzaName + ": " + sizeInInch + "인치, " + dough + " 도우를 사용한 기본 피자입니다. 주요 토핑 **"+topping+"**");
    }

    @Override
    public void bake(){
        System.out.println(pizzaName + " (표준): 오븐에서 표준 시간 동안 피자를 굽습니다.");
    }

    @Override
    public void bake(int time){
        System.out.println(pizzaName + " (시간 지정): " + time + " 분 동 특별히 피자를 굽습니다.");
    }

    public void bake(int time, int heat){
        System.out.println(pizzaName + " (온도+시간 지정): " + heat + " 도에서" + time + "분 동안 **" + topping + "** 피자를 완벽하게 굽습니다.");
    }
}
