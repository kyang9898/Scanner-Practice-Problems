import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");   

        String firstRepsonse = scanner.nextLine();

        System.out.println("Wow - Interesting! Tell me more!");

        String secondResponse = scanner.nextLine();

        System.out.println("Nice chatting with you! Goodbye!");
        scanner.close();
    }

}
