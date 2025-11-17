package test.three;

public class AbstractAvatar {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;

    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }

    AbstractAvatar(String name, int hp, int attack, int defense){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public int defense(int attack){
        if(attack > this.defense){
            this.hp -= attack - this.defense;
        }
        return hp;
    }

    public int attack(){
        return this.attack;
    }
}
