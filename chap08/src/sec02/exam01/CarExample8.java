package sec02.exam01;

public class CarExample8 {
    public static void main(String[] args) {
        Car8 myCar = new Car8();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    }
}
