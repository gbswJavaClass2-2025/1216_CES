package sec01.exam01;

public class Animal {
    // 필드 위치임
    public String species;

    // 생성자 위치
    public Animal(){}

    public Animal(String species){
        this.species = species;
    }

    // 메서드 위치
    public void eatNomal(){
        System.out.println(species + ": " + species+"이/가 일반적인 방식으로 먹이를 먹습니다.");
    }
    public void eatYarr(String food){
        System.out.println(species + ": " + species+"이/가 " + food +"을/를 맛있게 먹습니다.");
    }

    public void makeSound(){
        System.out.println(species + " 소리: " + species+"이/가 알 수 없는 소리를 냅니다.");
    }
}
