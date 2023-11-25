import java.util.Scanner;

public class R_1_1 {
    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Entered integer: " + intValue);

        System.out.println("Enter a double value: ");
            double doubleValue = scanner.nextDouble();
        System.out.println("Entered double value: " + doubleValue);
        System.out.println("Enter a boolean value (true or false): ");
             boolean booleanValue = scanner.nextBoolean();
        System.out.println("Entered boolean value: " + booleanValue);
        System.out.println("Enter a character: ");
            char charValue = scanner.next().charAt(0);
        System.out.println("Entered character: " + charValue);
        System.out.println("Enter a string: ");
             String stringValue = scanner.next();
        System.out.println("Entered string: " + stringValue);
            scanner.close();
        }

        public static void main(String[] args) {
            inputAllBaseTypes();
        }
    }
