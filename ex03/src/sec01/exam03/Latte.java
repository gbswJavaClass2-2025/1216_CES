package sec01.exam03;

public class Latte extends Coffee{
    public String foamType;
    public int milkCharge = 500;

    Latte(String name, String size, int basePrice, String foamType) {
        super(name, size, basePrice);
        this.foamType = foamType;
        // >> Coffee 객체 생성: Large 카라멜 라떼
    }

    @Override
    public void getBeverageInfo() {
        System.out.println(name + " 정보: 종류: " + name + " | 사이즈: " + size + " | 기본 가격: " + basePrice + " 원" + " | 거품 종류: **" + foamType + "**");
    }

    public void calculatePrice(int addShot){
        // 카라멜 라떼 최종 가격 (샷 추가): (우유 비용 500 원 포함 (+샷 추가 1,000 원)) 7000 원
        System.out.println(name + " 최종 가격 (샷 추가):  (우유 비용 " + milkCharge +  "원 포함 (+샷 추가 " + addShot + " 원))" + basePrice + " 원");
    }
}
