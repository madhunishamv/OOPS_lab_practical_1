abstract class Vehicle {
    abstract void service();  // abstract method
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void service() {
        System.out.println("Car is being serviced with engine oil and tire check.");
    }
}

class Bike extends Vehicle {
    void service() {
        System.out.println("Bike is being serviced with chain lubrication and brake check.");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.service();

        v2.start();
        v2.service();
    }
}
