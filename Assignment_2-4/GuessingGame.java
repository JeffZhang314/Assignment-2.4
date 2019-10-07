import java.util.Scanner;
class GuessingGame {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        int correctGuess = (int) (100 * Math.random() + 1);
        double guess;
        int numGuesses = 0;
        do {
            System.out.print("What is your guess? ");
            guess = sc.nextDouble();
            if (guess > correctGuess) {
                System.out.println("Too high ...");
            } else if (guess < correctGuess) {
                System.out.println("Too low ...");
            }
            numGuesses ++;
        } while (guess != correctGuess);
        String iesOrY = "ies";
        if (numGuesses == 1) {
            iesOrY = "y";
        }
        System.out.println("You've guessed my number! Good job! It only took you " + numGuesses + " tr" + iesOrY + ".");
    }
}