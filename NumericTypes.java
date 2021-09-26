import java.util.Scanner;// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
	   Scanner keyboard= new Scanner (System.in);// TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final double NUMBER = 2 ;        // Number of scores
      final double SCORE1 = 100;       // First test score
      final double SCORE2 = 95;        // Second test score
      final double BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      String firstName;// TASK #2 declare variables used here
      String lastName;
      String fullName;
      char firstInitial;
      double radius;// TASK #3 declare variables used here
      final double RADIUSC;
      double diameterSphere;
      double volume;
      // TASK #4 declare variables used here
      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               "  scores have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5/(double)9 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius. This is task 1 btw!";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      System.out.println("Task 2: Please enter your first name");// Prompt the user for first name
      firstName = keyboard.nextLine();// Read the user's first name
      System.out.println();
      System.out.println("Please enter your last name");// Prompt the user for last name
      lastName = keyboard.nextLine();// Read the user's last name
      System.out.println();  
      // Concatenate the user's first and last names
      System.out.println("OMG watch out your full name is coming back at ya at lightning speed:");
      fullName = (firstName + " " + lastName);
       System.out.println(fullName); // Print out the user's full name

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      System.out.println("Task 3: We are calculating your first initial!");// Get the first character from the user's first name
      firstInitial = firstName.charAt(0);
      // Print out the user's first initial
      System.out.println(firstInitial);
      // Convert the user's full name to uppercase
      fullName = fullName.toUpperCase();
      // Print out the user's full name in uppercase
      System.out.println();
      System.out.println();
      System.out.println("Here is your full name IN LARGE BIG LETTERS as well as how many characters in it!");
      System.out.println(fullName + " " + fullName.length() + " " + "characters");

      System.out.println();      // To leave a blank line
      System.out.println();
      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      System.out.println("Task 4: Please enter the diameter of your awesome cool sphere");
      // Read the diameter
      diameterSphere = keyboard.nextDouble();
      // Calculate the radius
      radius = (float) diameterSphere/2;
      volume = (float) 4/3 * Math.PI * Math.pow(radius,3);// Calculate the volume
      System.out.println("We went ahead and calculated the volume, take a look!:");
      System.out.println(volume);// Print out the volume
   }
}