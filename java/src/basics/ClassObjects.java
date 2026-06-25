package basics;

class Computer {

    String brand;
    String processor;
    int ram;

    void start() {
        System.out.println(brand + " computer is starting");
    }

    void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}

public class ClassObjects {

	public static void main(String[] args) {
		Computer comp = new Computer();

        comp.brand = "Dell";
        comp.processor = "Intel i5";
        comp.ram = 16;

        comp.start();
        comp.displaySpecs();
	}
}
