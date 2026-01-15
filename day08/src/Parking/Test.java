package Parking;

public class Test {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Car car = monitor.getCar();
        Charge charge = new Charge();
        charge.charge(car);
    }
}
