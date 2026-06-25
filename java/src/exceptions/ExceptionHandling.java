package exceptions;

//Custom Exception
class InvalidAgeException extends Exception {

 InvalidAgeException(String message) {
     super(message);
 }
}

public class ExceptionHandling{

// throws keyword
 static void checkAge(int age)
         throws InvalidAgeException {

     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above");
     }
     System.out.println("eligible");
 }

 public static void main(String[] args) {

	 //try catch 

     try {
         int result = 10 / 0;
         System.out.println(result);
         
     } catch (ArithmeticException e) {
         System.out.println("Cannot divide by zero");
     }

     //multiple catch

     try {
         String name = null;
         System.out.println(name.length());
     } catch (ArithmeticException e) {
         System.out.println("arithmetic exception "+ e);

     } catch (NullPointerException e) {
         System.out.println("null pointer exception");
     }

     //finally
     
     try {
         int num = 10 / 0;

     } catch (ArithmeticException e) {
         System.out.println("Exception Caught");

     } finally {
         System.out.println("always executes");
     }

     
     try {

         int[] marks = {80, 90, 70};
         System.out.println(marks[5]);

     } catch (
             ArrayIndexOutOfBoundsException e) {

         System.out.println("invalid arr index");
     }


     //throw
     try {
         int age = 15;
         if (age < 18) {
             throw new ArithmeticException("Age Not Eligible");
         }
     } catch (ArithmeticException e) {

         System.out.println(e.getMessage());
     }

 }
}