package exam08;

public class WideTire extends Tire{
    public int width;

    public WideTire(String model, int maxRotation, int width) {
        super(model, maxRotation);
        this.width = width;
    }
}