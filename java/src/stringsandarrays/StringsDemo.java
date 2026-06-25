package stringsandarrays;

import java.util.Scanner;

public class StringsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("name: " + name);
        System.out.println("length: " + name.length());

        if(name.length() > 0) {
            System.out.println("first char: "+ name.charAt(0));
        }

        System.out.println("uppercase: "+ name.toUpperCase());

        System.out.println("lowercase: "+ name.toLowerCase());

        System.out.println("contains a in name: "+ name.contains("a")); //boolean case sensitive

        System.out.println("replace : "+ name.replace("A", "@"));

        System.out.println("trim:"+ "   Hello   ".trim());


        //equals and ==
        String s1 = new String("Ansh");
        String s2 = new String("Ansh");

        System.out.println("using == : "
                + (s1 == s2));

        System.out.println("using equals(): "
                + s1.equals(s2));

        // equalsIgnoreCase()
        String user = "admin";
        System.out.println(user.equalsIgnoreCase("ADMIN")); //boolean

        //substring
        String city = "Mumbai";
        System.out.println(city.substring(0, 3)); //(incl,excl)

        // split()
        String skills ="Java,SQL,Python"; //single string

        String[] skillarr =skills.split(","); //splits into seprate strings

        for(String skill : skillarr) {
            System.out.println(skill);
        }

        // String Immutability
        String name1 = "Ansh";
        name1.concat(" Sarfare");
        System.out.println(name1);
        
        name1 = name1.concat(" Sarfare");
        System.out.println(name1);       
        
        // StringBuilder

        System.out.println("\nStringBuilder");
        StringBuilder p1 = new StringBuilder("Person");

        p1.append("Details"); //adds at end

        p1.insert(6, " Profile"); //adds at index
        System.out.println(p1);

        p1.replace(0, 6, "User");
        System.out.println(p1);

        p1.delete(0, 5);
        System.out.println(p1);

        p1.reverse();
        System.out.println(p1);

        sc.close();
    }
}