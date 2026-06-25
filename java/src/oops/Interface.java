package oops;

interface Vehicle1 {

    String CATEGORY = "Transport";     // public static final by default

    void start(); // public abstract by default
}

interface ElectricVehicle extends Vehicle1 {

    void chargeBattery();
}

interface SmartFeatures {

    void connectBluetooth();
    
    default void adas() {
        System.out.println("adas Enabled");
    }
    // Static Method
    static void cruisecontrol() {
        System.out.println("cruise control present");
    }
}

// Multiple inheritance through interfaces
class Tata implements ElectricVehicle, SmartFeatures {

    public void start() {
        System.out.println("Tata Started");
    }

    public void chargeBattery() {
        System.out.println("Battery Charging");
    }

    public void connectBluetooth() {
        System.out.println("Bluetooth Connected");
    }
}

public class Interface {

    public static void main(String[] args) {

        //error Vehicle v = new Vehicle();

        System.out.println("Category: "+ Vehicle1.CATEGORY);
        
        Vehicle1 v1 = new Tata();
        v1.start();

        Tata t1 = new Tata();
        t1.chargeBattery();
        t1.connectBluetooth();
        t1.adas();

        // Static Interface Method
        SmartFeatures.cruisecontrol();

    }
}