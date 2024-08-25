import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*");

        // This is to allow the user to input 
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        // This part is for it to generte the upper part of the Half-diamond
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }

        // This is for the lower part of the pattern
        for (int i = n-1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        System.out.println("*");

        scanner.close();
    }
}