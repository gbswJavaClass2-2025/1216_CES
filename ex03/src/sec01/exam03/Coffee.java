package sec01.exam03;

public class Coffee {
    public String name;
    public String size;
    public int basePrice;

    Coffee(String name, String size, int basePrice){
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
        // >> Coffee 객체 생성: Medium 아메리카노
        System.out.println(">> Coffee 객체 생성: " + size + " " + name);
    }

    // 아메리카노 정보: 종류: 아메리카노 | 사이즈: Medium | 기본 가격: 4000 원
    public void getBeverageInfo(){
        System.out.println(name + " 정보: 종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원");
    }

    //아메리카노 최종 가격 (기본): 4000 원
    //아메리카노 최종 가격 (할인): (할인율 10.0% 적용) 3600 원
    public void calculatePrice(){
        System.out.println(name + " 최종 가격 (기본): " + basePrice + " 원");
    }
    public void calculatePrice(float discount){
        int total = (int) (basePrice * (100.0 - discount));
        System.out.println(name + " 최종 가격 (할인): (할인율 " + discount + "% 적용) " + total + " 원");
    }
}
