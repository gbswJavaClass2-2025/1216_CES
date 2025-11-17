package sec02.exam04;

public class Driver8 {
    public void drive (Vehicle8 vehicle) {
        if (vehicle instanceof Bus8) {
            Bus8 bus = (Bus8) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
