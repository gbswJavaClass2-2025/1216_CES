package sec01.exam01;

public class Dog extends Animal{
    // 필드 위치
    public String bread;

    // 생성자 위치
    public Dog(){}
    public Dog(String bread){
        this.species = "개";
        this.bread = bread;
    }

    // 메서드 위치
    public void eat(int kcal){
        System.out.println(bread + ": 개(" + bread + ")가 " + kcal + "칼로리만큼 에너지를 보충합니다.");
    }

    @Override
    public void makeSound(){
        System.out.println(bread + " 소리: 멍멍! (품종: " + bread+")");
    }
    public void eat(){
        System.out.println(bread + ": " + species+"이/가 일반적인 방식으로 먹이를 먹습니다.");
    }
    public void eat(String food){
        System.out.println(bread + ": " + species+"이/가 " + food +"을/를 맛있게 먹습니다.");
    }
}
