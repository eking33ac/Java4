import java.util.Scanner; // import a scanner 
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");// console.writeline in c# 
        // how to do Console.ReadLine()

        // declare the scanner, which listens to keyboard input (does it listen to all inputs?)
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter username");

        String userName = scanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input



        System.out.println("What year you were born?");

        int year = scanner.nextInt();

        int age = 2025 - year;

        System.out.println("You are "+age+" years old.");
    }
}