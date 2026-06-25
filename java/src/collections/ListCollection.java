package collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	
	public static void main(String[] args) {

        List<String> courses = new ArrayList<>();

        courses.add("Web Dev");
        courses.add("App Dev");
        courses.add("DBMS");

        courses.add(1, "Blockchain");

        System.out.println("courses: " + courses);

        System.out.println("first Course: "+ courses.get(0));

        courses.set(2, "Cybersecurity");

        System.out.println("updated courses: "+ courses);

        System.out.println("contains java: "+ courses.contains("DBMS"));

        courses.remove("Web Dev");

        System.out.println("after removal: "+ courses);

        System.out.println("total number of courses: "+ courses.size());

    }
}
