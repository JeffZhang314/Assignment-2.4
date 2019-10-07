import java.util.Scanner;

class RunningTally {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        System.out.println("");
        int total = 0;
        int input = 0;
        while (input >= 0) {
            System.out.print("Add:  ");
            total += input;
            input = scanner.nextInt();
        }
        System.out.println("");
        System.out.println("Your total is " + total + ".");
    }
}