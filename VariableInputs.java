import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String textString = scanner.nextLine();

        System.out.println("Enter an integer:");
        int valueInteger = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double:");
        double valueDouble = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean:");
        boolean valueBoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + textString);

        System.out.println("Your integer is " + valueInteger);

        System.out.println("Your double is " + valueDouble);

        System.out.println("Your boolean is " + valueBoolean);

        scanner.close();
    }
    
}
