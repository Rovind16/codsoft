package Codesoft;
import java.util.*;


public class Randomnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int win = 0;
        int maxRound = 5; 
        for (int i = 1; i < maxRound+1; i++) {
            System.out.println("Round " + i);
            int val = random.nextInt(100) + 1;
            int maxattempt = 10;
            int j=0;
              for (j = 0; j < maxattempt; j++) {
                System.out.print("Enter your guess number [1-100]: ");
                int gusessval = sc.nextInt();
                if (gusessval == val) {
                    System.out.println("Congratulations! You are correct " + val + " in " + (j + 1) + " attempts.");
                    break;
                } else if (gusessval < val) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
              if (j == maxattempt && j != 0) {
                System.out.println("you've reached the maximum attempts");
              }
            if (i < maxRound) {
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = sc.next().toLowerCase();

                if (!(playAgain.equals("yes"))) {
                    break;
                }
            }
            win++;
        }
        System.out.println("\nGame Over! You played " + (maxRound - 1) + " rounds and won " + win + " rounds.");
    }
}
