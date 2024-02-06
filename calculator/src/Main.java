import java.util.*;

public class Main {
    public static void main(String[] args) {

        int n1 ,n2;

        System.out.println("Welcome to the calculator!!!");
        System.out.println(" Press 1 to ADD\n Press 2 to Subtract\n Press 3 to Multiply\n Press 3 for Divide\n\n ");

        Scanner scanner = new Scanner(System.in);

        int option;

        while (true) {
            System.out.println("Choose an option: ");
            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option >= 1 && option <= 4) {
                    break;
                } else {
                    System.out.println("Invalid option!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter between(1-4)");
            }
        }
        //Double numbers = scanner.nextDouble();
        while (true) {
            System.out.println("Enter the first Number: ");
            if (scanner.hasNextInt()) {
                n1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer for the first number.");
                scanner.next();
            }
        }
        while (true) {
            System.out.println("Enter the second Number: ");
            if (scanner.hasNextInt()) {
                n2 = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer for the second number.");
                scanner.next();
            }
        }

        double result;
        switch (option) {
            case 1 -> result = n1 + n2;
            case 2 -> result = n1 - n2;
            case 3 -> result = n1 * n2;
            case 4 -> {
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("zero division");
                    return;
                }
            }
            default -> {
                System.out.println("Invalid option. Select between (1-4).");
                return;
            }
        }

        System.out.println("Answer : " + result);
    }
}