import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        //create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
        //closes the scanner
        scanner.close();
    }
}
