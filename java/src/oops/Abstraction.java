package oops;

abstract class Vehicle {

    protected String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("vehicle constructor called");
    }

    // Abstract Method
    abstract void startEngine();

    void displayBrand() {
        System.out.println("brand: " + brand);
    }
}

abstract class Car extends Vehicle {

    Car(String brand) {
        super(brand);
        System.out.println("car constructor called");
    }

    // One abstract method implemented
    void startEngine() {
        System.out.println("engine started");
    }

    // Another abstract method
    abstract void transmission();
}

// Concrete Class
class Honda extends Car {

    Honda(String brand) {
        super(brand);
        System.out.println("Honda constructor called");
    }

    void transmission() {
        System.out.println("Manual");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        // error: Cannot instantiate abstract class
        // Vehicle v = new Vehicle("");
        // Car c = new Car("");

        Vehicle v1 = new Honda("Honda city");

        System.out.println();
        v1.displayBrand();
        v1.startEngine();

        // Downcasting to access child-specific method
        Honda h1 = (Honda) v1;

        h1.transmission();
    }
}