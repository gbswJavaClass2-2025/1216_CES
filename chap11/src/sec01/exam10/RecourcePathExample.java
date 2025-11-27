package sec01.exam10;

public class RecourcePathExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("img.png").getPath();
        String photo2Path = clazz.getResource("images/img.png").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);
    }
}
