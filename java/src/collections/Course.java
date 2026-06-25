package collections;

public class Course implements Comparable<Course> {

    private String name;
    private int duration;

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    // Comparable
    @Override
    public int compareTo(Course c) {

        return this.duration - c.duration;
    }

    @Override
    public String toString() {
        return name + " (" + duration + " months)";
    }
}