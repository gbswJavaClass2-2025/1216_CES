package test.three;

public class Game {
    public static void main(String[] args) {
        November a1 = new November();
        December a2 = new December();

        a1.defense(a2.attack());
        a2.defense(a1.attack());

        System.out.println("November:"+a1.hp);
        System.out.println("December:"+a2.hp);
    }
}