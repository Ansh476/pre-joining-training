package filereadwrite;

import java.io.*;

public class FileReadWrite {

    static final String file ="./src/filereadwrite/student_info.txt";

    public static void main(String[] args) {

        String studentData ="Name: Ansh\n Age: 22\n Branch: INFT";

        // write
        try (BufferedWriter writer =new BufferedWriter(new FileWriter(file))) {

            writer.write(studentData);
            System.out.println("data written success");

        } catch (IOException e) {
            System.out.println("err: "+ e.getMessage());
        }

        // read
        System.out.println("\nreading file");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println( "err: "+ e.getMessage());
        }
    }
}