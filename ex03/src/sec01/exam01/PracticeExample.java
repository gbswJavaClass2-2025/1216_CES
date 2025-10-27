package sec01.exam01;

public class PracticeExample {
    public static void main(String[] args) {
        System.out.println("----- 실습 시작 -----");
        Animal horangE = new Animal("호랑이");
        System.out.println(">> Animal 객체 생성: " + horangE.species);
        Dog gangAG = new Dog("골든 리트리버");
        System.out.println(">> Animal 객체 생성: " + gangAG.species);
        System.out.println();

        System.out.println("[1. 상속 &2. 객체]");
        System.out.println("--- " + horangE.species + " 정보 ---");
        System.out.println("--- " + gangAG.species + " 정보 ---");
        System.out.println();

        System.out.println("[4. 오버라이딩]");
        horangE.makeSound();
        gangAG.makeSound();
        System.out.println();

        System.out.println("[3. 오버로딩]");
        horangE.eat();
        horangE.eat("생고기");
        gangAG.eat();
        gangAG.eat("개껌");
        gangAG.eatKcal(500);
    }
}
