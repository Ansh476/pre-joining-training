package oops;

class Student {

    private String name;
    private int age;

    //getter
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Ansh");
        s1.setAge(22);

        System.out.println("Name: "+ s1.getName());
        System.out.println("Age: "+ s1.getAge());

        s1.displayDetails();

        s1.setAge(-20);
    }
}
