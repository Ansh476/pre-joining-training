package basics;

class Computer4 {

    // Static Variable
    static String manufacturer = "Dell";

    // Instance Variables
    String model;
    int ram;

    Computer4(String model, int ram) {
        this.model = model;
        this.ram = ram;
    }

    // Static Method
    static void displayManufacturer() {

        // Local Variable
        String country = "USA";

        System.out.println("manufacturer: "+ manufacturer); // static var
        System.out.println("country: "+ country);

        // System.out.println(model);  error: Cannot access instance variable
    }

    void displayComputer() {

        System.out.println("model: " + model);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("manufacturer: "+ manufacturer);
    }
}
public class StaticDemo {

    public static void main(String[] args) {

        Computer4 comp = new Computer4("victus", 16);

        // Access static variable using class name
        System.out.println(Computer4.manufacturer);

        // Access static method using class name
        Computer4.displayManufacturer();

        Computer4.manufacturer = "HP";

        System.out.println();
        comp.displayComputer();

    }
}