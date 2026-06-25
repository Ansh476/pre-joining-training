package basics;

class Computer1 {

    String brand;
    String processor;
    int ram;

    // Default Constructor
    Computer1() {
        brand = "Unknown";
        processor = "Not Assigned";
        ram = 0;
        System.out.println("Default constructor");
    }

    // Parameterized Constructor
    Computer1(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        System.out.println("Parameterized constructor");
    }

    public void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println();
    }
}

public class ConstructorsDemo {

	public static void main(String[] args) {
		Computer1 comp = new Computer1(); //calls default constructor
        comp.displaySpecs(); 

        Computer1 comp1 = new Computer1("HP", "Ryzen 7", 32); // calls parameterized constructor 
        comp1.displaySpecs();
	}
}
