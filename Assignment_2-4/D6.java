import java.util.Scanner;
class D6 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int intInput, dieRollResult, total;
        String yOrN;
        do {
            System.out.print("How many D6's do you want to roll? ");
            intInput = Integer.parseInt(sc.nextLine());
            System.out.print("\nYou rolled:");
            total = 0;
            for (int i = 0; i < intInput; i ++) {
                dieRollResult = (int) (Math.random() * 6 + 1);
                System.out.print(" " + dieRollResult);
                total += dieRollResult;
            }
            System.out.println("\nTotal: " + total + "\n");
            System.out.print("Again? [y,n] ");
            yOrN = sc.nextLine();
            if (yOrN.equals("y")) {
                System.out.println("");
            }
        } while (yOrN.equals("y"));
        System.out.println("Good-bye!");
    }
}