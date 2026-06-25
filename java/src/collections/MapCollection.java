package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ansh");
        students.put(2, "Rakshit");
        students.put(3, "Nitish");

        System.out.println("students: "+ students);

        System.out.println(" student no.2: "+ students.get(2));

        students.replace(3, "Vivek");

        System.out.println("updated: "+ students);

        System.out.println("Contains student no.1: "+ students.containsKey(1));

        System.out.println("contains rakshit: "+ students.containsValue("Rakshit"));

        students.remove(2);

        System.out.println("after removal: "+ students);

        System.out.println("total num: "+ students.size());

        for (Map.Entry<Integer, String> entry: students.entrySet()) {

            System.out.println(entry.getKey()+ " - "+ entry.getValue());
        }
    }
}

