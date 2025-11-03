package sec01.exam03;

public class CoffeShop {
    public static void main(String[] args) {
        System.out.println("----- 커피 전문점 시스템 실습 시작 -----");
        Coffee coffee = new Coffee("아메리카노", "Medium", 4000);
        Latte latte = new Latte("카라멜 라떼", "Large", 5500, "벨벳 폼");

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("[4. 오버라이딩 (음료 정보)]");
        coffee.getBeverageInfo();
        latte.getBeverageInfo();

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("[3. 오버로딩 (가격 계산)]");
        coffee.calculatePrice();
        coffee.calculatePrice(10.0F);
        System.out.println();
        latte.calculatePrice();
        latte.calculatePrice(20.0F);
        latte.calculatePrice(1000);
        System.out.println();
        System.out.println("----- 실습 종료 -----");
    }
}
