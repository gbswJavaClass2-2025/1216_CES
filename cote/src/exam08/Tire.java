package exam08;

public class Tire {
    public String model;
    public int maxRotation;
    public int nowRotation = 0;

    public Tire(String model, int maxRotation) {
        this.model = model;
        this.nowRotation = 0;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        if (nowRotation >= maxRotation) return false;
        else { nowRotation++; return true; }
    }
}
