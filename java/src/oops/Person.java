package oops;

class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Called");
    }

    void displayDetails() {
        System.out.println("Name: " + name + "and age: " + age);
    }
}
