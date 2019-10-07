import java.util.Scanner;
class Triangle {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What character do you want your triangle made of? ");
        String CHAR = scanner.nextLine();
        System.out.print("How tall do you want your triangle? ");
        int x = scanner.nextInt();
        System.out.println("");
        System.out.println("Here's your triangle!");
        System.out.println("");
        for (int i = 0; i <= x; i ++) {
            for (int j = 0; j <= i; j ++ ) {
                System.out.print(CHAR);
            }
            System.out.println("");
        }
    }
}