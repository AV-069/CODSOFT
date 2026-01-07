import java.util.Random;
import java.util.Scanner;
class NumberGame 
 {public static void main(String[] args) 
  {Scanner sc = new Scanner(System.in);
   Random r = new Random();
   String playAgain;
   do {
      int num = r.nextInt(100) + 1; 
      int attempts = 0;
      boolean guessedCorrectly = false;
      System.out.println("Guess the number between 1 and 100. You have 6 attempts.");
      while (attempts < 6)
       {System.out.print("Enter your guess: ");
        int guess = sc.nextInt();
        attempts++;
        if (guess == num)
         {System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts!");
           guessedCorrectly = true; break;} 
        else if (guess < num) 
          System.out.println("The number you entered is too low!");
        else 
          System.out.println("The number you entered is too high!");
       }
      if (!guessedCorrectly) 
        System.out.println("Uh-oh! You have used up all your chances! The number was " + num + ".");
      System.out.print("Do you want to play again? (yes/no): ");
      playAgain = sc.next();
      } while (playAgain.equalsIgnoreCase("yes"));
   
   System.out.println("Exiting!");
   sc.close();
    }
}
