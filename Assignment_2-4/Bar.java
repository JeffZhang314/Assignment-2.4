import java.util.Scanner;
class Bar {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What character do you want your bar made of? ");
        String CHAR = scanner.nextLine();
        System.out.print("How long do you want your bar? ");
        int x = scanner.nextInt();
        System.out.println("");
        System.out.println("Here's your bar!");
        System.out.println("");
        for (int i = 0; i < x; i ++) {
            System.out.print(CHAR);
        }
    }
}