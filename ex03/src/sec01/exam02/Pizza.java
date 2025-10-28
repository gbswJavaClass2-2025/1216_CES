package sec01.exam02;

public class Pizza {
    // 필드
    public String dough;
    public int sizeInInch;
    public String pizzaName;

    // 생성자
    public Pizza(){}
    public Pizza(String dough, int sizeInInch, String pizzaName){
        System.out.println(">>Pizza 객체 생성: " + dough + " " + sizeInInch + "인치 피자");
        this.dough = dough;
        this.sizeInInch = sizeInInch;
        this.pizzaName = pizzaName;
    }

    //메서드
    public void describe(){
        System.out.println(pizzaName + ": " + sizeInInch + "인치, " + dough + " 도우를 사용한 기본 피자입니다.");
    }
    public void bake(){
        System.out.println(pizzaName + ": 오븐에서 표준 시간 동안 피자를 굽습니다.");
    }
    public void bake(int time){
        System.out.println(pizzaName + ": " + time + " 분 동 특별히 피자를 굽습니다.");
    }
}
