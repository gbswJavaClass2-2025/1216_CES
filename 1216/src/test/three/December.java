package test.three;

public class December extends AbstractAvatar{
    December() {
        super("December", 20, 13, 25);
    }

    @Override
    public int attack(){
        System.out.println("December - Attack");
        return this.attack;
    }
}
