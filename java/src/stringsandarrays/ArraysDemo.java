package stringsandarrays;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];

        System.out.println("Enter 5 ages:");
        for(int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        
        for(int i = 0; i < ages.length; i++) {
            System.out.println("age: " + ages[i]);
        }

        int sum = 0;

        for(int age : ages) {
            sum += age;
        }

        double avg = (double) sum / ages.length;

        System.out.println("\nsum: " + sum);
        System.out.println("average: " + avg);


        int max = ages[0];
        int min = ages[0];

        for(int i=1;i<ages.length;i++) {

            if(ages[i] > max)
                max = ages[i];

            if(ages[i] < min)
                min = ages[i];
        }

        System.out.println("max age: " + max);
        System.out.println("min age: " + min);

        // 2d array
        System.out.println("\n2d array");

        int[][] marks = {
                {73, 90, 88},
                {78, 92, 84}
        };

        for(int i = 0; i < marks.length; i++) {

            for(int j = 0;j < marks[i].length;j++) {

                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
