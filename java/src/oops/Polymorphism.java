package oops;


class Emp extends Person {

    private double salary;

    Emp(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("employee constructor called");
    }

    @Override //annotation
    void displayDetails() {
    	System.out.println("Name: " + name + " age: " + age+ " salary: "+ salary);
    }
}

class Calculator {

    // Different number of parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Different parameter types
    double add(double a, double b) {
        return a + b;
    }

    // Different order of parameters
    String add(String name, int age) {
        return name + " is " + age + " years old";
    }

    String add(int age, String name) {
        return name + " is " + age + " years old";
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("compile time polymorphism");
        Calculator calc = new Calculator();

        System.out.println("two integers: "+ calc.add(6, 23));

        System.out.println("three integers: "+ calc.add(10, 14, 51));

        System.out.println("two doubles: "+ calc.add(85.5, 29.3));

        System.out.println(calc.add("Ansh", 22));

        System.out.println(calc.add(18, "Omkar"));

        System.out.println("\nruntime polymorphism");
        // Upcasting
        Person p1 = new Emp("Vishal",25,60000);
        p1.displayDetails();
        
        //Downcasting
        Person p2 = new Emp("Karan", 32, 70000);
        Emp e = (Emp) p2;
        e.displayDetails();
        
        //error: Employee e = new Person("KK",22)
        
    }
}