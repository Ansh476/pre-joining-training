package basics;

class Computer2 {

    private double price;
    String brand; //default
    protected String processor;
    public int ram;

    Computer2(double price, String brand, String processor, int ram) {
        this.price = price;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    // Getter
    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {
        this.price = price;
    }

    public void displaySpecs() {
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        Computer2 comp = new Computer2(79999.99,"HP","Ryzen 7",16);
        System.out.println("Current price: "+ comp.getPrice()); //Private
        
        comp.setPrice(69999.99);
        System.out.println("New price:"+ comp.getPrice());
        
        System.out.println("Default: " + comp.brand);
        comp.brand = "Dell";
        System.out.println("Protected: "+ comp.processor);
        comp.processor = "Intel i7";
        System.out.println("Public: " + comp.ram);
        comp.ram = 32;
        
        System.out.println("Updated Details:");
        comp.displaySpecs();
        }
}
