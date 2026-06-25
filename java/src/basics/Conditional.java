package basics;

public class Conditional {
	public static void main(String[] args) {

        int age = 22;
        int goals = 18;
        String position = "Forward";

        if (goals >= 15)
            System.out.println("Player qualified.");
        
        //if-else
        if (age >= 18) {
            System.out.println("eligible for senior team.");
        } else {
            System.out.println("eligible for junior team.");
        }

        //else if 
        if (goals >= 30) {
            System.out.println("first class striker");
        } else if (goals >= 20) {
            System.out.println("excellent striker");
        } else if (goals >= 10) {
            System.out.println("good striker");
        } else {
            System.out.println("needs improvement");
        }

        // nested if
        if (age >= 18) {

            if (goals >= 15) {
                System.out.println("Selected for state team");
            } else {
                System.out.println("not enough goals for selection");
            }

        } else {
            System.out.println("Age requirement not met");
        }

        //switch
        switch (position) {

            case "Forward":
                System.out.println("role: Score goals");
                break;

            case "Midfielder":
                System.out.println("role: Create chances");
                break;

            case "Defender":
                System.out.println("role: Stop attacks");
                break;

            case "Goalkeeper":
                System.out.println("role: Save goals");
                break;

            default:
                System.out.println("Unknown Position");
        }
    }
}
