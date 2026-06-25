package collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
	public static void main(String[] args) {

        Set<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Python");
        skills.add("Java");   // duplicate

        System.out.println("skills: "+ skills);

        System.out.println("contains Java: "+ skills.contains("Java"));

        skills.remove("Python");

        System.out.println("after removal: "+ skills);

        System.out.println("Total num of skills: "+ skills.size());

    }
}
