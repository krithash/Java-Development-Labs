package Oops;

interface vehicle {
    void start();

    default void fuel() {
        System.out.println("Fueling vehicle...");
    }

    static void service() {
        System.out.println("Vehicle needs service.");
    }
}

abstract class Machine {
    abstract void operate();

    void poweron() {
        System.out.println("Powering on...");
    }
}

class ElectricCar extends Machine implements vehicle {
    @Override
    public void start() {
        System.out.println("ElectricCar starting...");
    }

    @Override
    public void operate() {
        System.out.println("Operating the ElectricCar...");
    }
}

public class abstraction {
    public static void main(String[] args) {
        ElectricCar c = new ElectricCar();
        c.start();
        c.fuel();
        c.operate();
        c.poweron();
        vehicle.service(); // static method calling
        }
}
