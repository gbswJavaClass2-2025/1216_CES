package sec02.exam07;

public class FloatDubleExample {
    public static void main(String[] args) {
        float var2 = 3.14f;
        double var3 = 3.14;

        float var4 = 0.12345678901234567890f;
        double var5 = 0.12345678901234567890;

        System.out.println("var2 :" + var2);
        System.out.println("var3 :" + var3);
        System.out.println("var4 :" + var4);
        System.out.println("var5 :" + var5);

        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
    }
}
