package sec02.exam01;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
        Product product2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
        Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

        System.out.println(product1.informarion());
        System.out.println(product2.informarion());
        System.out.println(product3.informarion());
        System.out.println("======================");

        product1.setPrice(1200000);
        product1.setTax(0.05);
        product2.setPrice(1200000);
        product2.setTax(0.05);
        product3.setPrice(1200000);
        product3.setTax(0.05);

        System.out.println(product1.informarion());
        System.out.println(product2.informarion());
        System.out.println(product3.informarion());
        System.out.println("======================");

        System.out.println("상품명 : " + product1.getProductName());
        System.out.println("부가세 포함 가격 : " + product1.getBugassePoham() + "원");
        System.out.println("상품명 : " + product2.getProductName());
        System.out.println("부가세 포함 가격 : " + product2.getBugassePoham() + "원");
        System.out.println("상품명 = " + product3.getProductName());
        System.out.println("부가세 포함 가격 = " + product3.getBugassePoham() + "원");
    }
}
