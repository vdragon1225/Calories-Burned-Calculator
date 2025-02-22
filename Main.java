import java.util.Scanner; // import Scanner

public class Main {
   public static void main(String[] args) {
      // Declare variables
      int age, weight, heartRate, time;
      double caloriesBurned;

      // Declare Scanner
      Scanner scnr = new Scanner(System.in);

      // Get user's age
      System.out.print("Enter age (years): ");
      age = scnr.nextInt(); 

      // Get user's weight
      System.out.print("Enter weight (lbs): ");
      weight = scnr.nextInt();

      // Get user's heart rate during the workout
      System.out.print("Enter heart rate during workout (bpm): ");
      heartRate = scnr.nextInt();

      // Get workout duration
      System.out.print("Enter workout duration (minutes): ");
      time = scnr.nextInt();

      // Calculate amount of calories burned
      caloriesBurned = (age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * time / 8.368;

      // Output
      System.out.printf("Calories Burned: %.2f", caloriesBurned); // Print caloriesBurned with two decimal places
      System.out.println(" calories");

      // close Scanner
      scnr.close(); 
   }
} 
