package oops;


class Employee extends Person {

    protected double salary;

    Employee(String name, int age, double salary) {

        super(name, age);
        this.salary = salary;
        System.out.println("employee constructor called");
    }

    void displayEmployee() {

        System.out.println("name: " + super.name + " age: " + super.age + " salary: " + salary);
    }
}

class Manager extends Employee {

    private String dept;

    Manager(String name,int age,double salary,String dept) {

        super(name, age, salary);
        this.dept = dept;
        System.out.println("Manager Constructor Called");
    }

    void displayManager() {

        System.out.println("Department: "+ dept);
        super.displayEmployee();
    }
}

public class Inheritance {
	  public static void main(String[] args) {
    Manager manager = new Manager("Ansh",22,50000,"IT");

    manager.displayManager();
    manager.displayDetails();
    manager.displayEmployee();
	}
}
