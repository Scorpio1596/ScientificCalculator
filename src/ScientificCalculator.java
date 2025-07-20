import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu();
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("=== Scientific Calculator ===");
        System.out.println("1. Add\n2. Subtract\n3. Exit");
    }
}
