package test.three;

public class November extends AbstractAvatar{
    public November() {
        super("November", 30, 20, 10);
    }

    @Override
    public int attack(){
        System.out.println("November - Attack");
        return this.attack;
    }
}
