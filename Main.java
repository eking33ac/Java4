import java.util.Scanner; // import a scanner 
public class Main {
    public static void main(String[] args) {
        // java type conversion

        // type variable_name = (type) value
        // int varname = (int) otherVarName
        // also parsing (idk how yet)

        // string ops
        // varname.length()
        // varname.toUpperCase()
        // varname.toLowerCase()
        // index to check if there is text somewhere in the string (probably returns the index it starts at)

        // new line: \n (many more, used within strings, java strings section on W3Schools)

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








        // get max number of 3
        System.out.println("Input first number");
        int num1 = scanner.nextInt();
        System.out.println("Input second number");
        int num2 = scanner.nextInt();
        System.out.println("Input third number");
        int num3 = scanner.nextInt();

        // in java, all method names start with lowercase
        // in c#, all method names start with uppercase
        System.out.println("Largest number: " + Math.max(Math.max(num1,num2), Math.max(num3,num2)));

        

        // if else if else is the same as c#
        int largest = 0;

       if (num1 >= num2 && num1 >= num3 ) {
        largest = num1;
       }
       if (num2 >= num1 && num2 >= num3 ) {
        largest = num2;
       }
       if (num3 >= num2 && num3 >= num1 ) {
        largest = num3;
       }
    }
}