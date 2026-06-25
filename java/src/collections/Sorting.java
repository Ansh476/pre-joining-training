package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();

        courses.add(new Course("Web Dev", 6));
        courses.add(new Course("App Dev", 3));
        courses.add(new Course("Blockchain", 4));
        courses.add(new Course("Machine Learning", 8));

        System.out.println("List");
        System.out.println(courses);

        // Comparable
        Collections.sort(courses);

        System.out.println("\nsorted by duration");

        System.out.println(courses);

        // Comparator
        Collections.sort(courses,Comparator.comparing(Course::getName));

        System.out.println("\nsorted by name");

        System.out.println(courses);
    }
}