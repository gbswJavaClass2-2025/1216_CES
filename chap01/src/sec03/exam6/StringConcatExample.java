package sec03.exam6;

public class StringConcatExample {
    public static void main (String[] args) {
        int value = 10 + 2 + 8;
        System.out.println(value);

        String str1 = 1 + 2 + "8";
        System.out.println(str1);

        str1 = 1 + "2" + 8;
        System.out.println(str1);

        str1 = "1" + 2 + 8;
        System.out.println(str1);
    }
}
