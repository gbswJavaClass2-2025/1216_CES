package exam08;

public class ColorTire extends Tire{
    public String color;

    public ColorTire(String model, int maxRotation, String color) {
        super(model, maxRotation);
        this.color = color;
    }
}