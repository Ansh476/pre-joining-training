package json;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonExample {

    public static void main(String[] args) {

        // JSON obj
        JSONObject course = new JSONObject();

        course.put("id", 101);
        course.put("name", "Java Programming");
        course.put("duration", 4);

        System.out.println(course.toString(2));

        // JSON arr
        JSONArray technologies = new JSONArray();

        technologies.put("Java");
        technologies.put("SQL");
        technologies.put("React");
        technologies.put("Python");

        System.out.println(technologies.toString(2));

        // Nested JSON Object
        
        JSONObject instructor = new JSONObject();

        instructor.put("name", "Ansh");
        instructor.put("experience", 2);

        course.put("instructor", instructor);

        System.out.println(course.toString(2));

        // Array of JSON Objects
        JSONArray courses = new JSONArray();

        JSONObject c1 = new JSONObject();
        c1.put("id", 1);
        c1.put("name", "Java");

        JSONObject c2 = new JSONObject();
        c2.put("id", 2);
        c2.put("name", "Python");

        courses.put(c1);
        courses.put(c2);

        System.out.println(courses.toString(2));


        // Parse JSON String
        String jsonString ="{\"id\":3,\"name\":\"React\",\"duration\":3}";

        JSONObject parsedobj = new JSONObject(jsonString);

        System.out.println(parsedobj.toString(2));


        // Java Object to JSON
        Student student =new Student(1, "Omkar", "INFT");

        JSONObject studentJson = new JSONObject();

        studentJson.put("id", student.getId());
        studentJson.put("name", student.getName());
        studentJson.put("branch", student.getBranch());

        System.out.println(studentJson.toString(2));
    }
}

class Student {

    private int id;
    private String name;
    private String branch;

    public Student(int id,String name,String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}
