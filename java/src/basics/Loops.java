package basics;

public class Loops {

    public static void main(String[] args) {

    	//for
        System.out.println("for loop");
        int match = 1;
        for (int m = match; m <= 5; m++) {
            System.out.println("match " + m);
        }

        //while
        System.out.println("\nwhile loop");
        int goals = 1;

        while (goals <= 3) {
            System.out.println("goal num: " + goals);
            goals++;
        }

        //do-while
        System.out.println("\ndo while loop");

        int assists = 1;
        do {
            System.out.println("assists " + assists);
            assists++;
        } while (assists <= 5);

        //nested for
        System.out.println("\nnested loop");
        for (int week = 1; week <= 2; week++) {

            System.out.println("Week " + week);
            int training = 1;
            int i = training;
            for (i = 1; i <= 3; i++) {
                System.out.println("  trianing day " + i);
            }
        }

        //enhanced for
        String[] players = {"Messi","Ronaldo","Neymar"};

        for (String player : players) {
            System.out.println(player);
        }

        //break
        System.out.println("\nbreak");
        int jerseynum = 1;
        for (int j = jerseynum; j <= 10; j++) {

            if (j == 6) {
                break;
            }
            System.out.println("jersey num: " + j);
        }

        //continue
        System.out.println("\ncontinue");
        for (int j = jerseynum; j <= 5; j++) {

            if (j == 3) {
                continue;
            }

            System.out.println("jersey num: " + j);
        }
    }
}