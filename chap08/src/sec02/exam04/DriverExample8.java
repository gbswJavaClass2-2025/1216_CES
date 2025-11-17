package sec02.exam04;

public class DriverExample8 {
    public static void main(String[] args) {
        Driver8 driver = new Driver8();

        Bus8 bus = new Bus8();
        Taxi8 taxi = new Taxi8();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
