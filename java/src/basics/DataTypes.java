package basics;

public class DataTypes {

    // Primitive Data Types
    byte jerseyNum = 10;
    short speed = 30; // km/h
    int careerGoals = 911;
    long transferFee = 150000000L;

    float weight = 75.5f; // kg
    double height = 175.5; // cm

    char position = 'F';
    boolean isCaptain = true;

    // Non-Primitive Data Types

    String name = "Lionel Messi";
    int[] goalsscored = {2, 1, 0, 3, 1};

    public static void main(String[] args) {

        DataTypes player = new DataTypes();

        System.out.println("jersey Number: " + player.jerseyNum);
        System.out.println("speed: " + player.speed + " km/h");
        System.out.println("career Goals: " + player.careerGoals);
        System.out.println("transfer Fee: " + player.transferFee);
        System.out.println("weight: " + player.weight + " kg");
        System.out.println("height: " + player.height + " cm");
        System.out.println("position: " + player.position);
        System.out.println("captain: " + player.isCaptain);

        System.out.println("player Name: " + player.name);
        System.out.println("name length: " + player.name.length()); //length()

        System.out.print("goals in Last 5 matches: ");
        for (int i = 0; i < player.goalsscored.length; i++) { //arr.length
            System.out.print(player.goalsscored[i] + " ");
        }
        System.out.println();

        // Implicit Type Conversion
        int goals = player.careerGoals;
        double goalsDouble = goals;

        System.out.println("Converted to Double: " + goalsDouble);

        // Explicit Type Conversion
        double playerHeight = player.height;
        int roundedHeight = (int) playerHeight;

        System.out.println("Original height: " + playerHeight);
        System.out.println("Rounded height: " + roundedHeight);

        // Type Promotion

        byte assists = 20;
        byte keyPasses = 15;

        int totalContribution = assists + keyPasses;
        System.out.println("total Contribution: " + totalContribution);

        // chat to int Conversion

        int asciiValue = player.position; //F
        System.out.println("ASCII value: " + asciiValue);

        // int to char Conversion

        int record = 75;
        char playerrecord = (char) record;
        System.out.println("character: " + playerrecord);
    }
}