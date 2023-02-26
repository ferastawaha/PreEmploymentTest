package com.rs2.exam;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n Select an option:");
            System.out.println("1. String Manipulation");
            System.out.println("2. File Manipulation");
            System.out.println("3. Exceptions");
            System.out.println("4. Collections");
            System.out.println("5. Exit");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (option) {
                    case 1:
                        StringManipulation.main(args);
                        break;
                    case 2:
                        FileManipulation.main(args);
                        break;
                    case 3:
                        ExceptionHandling.main(args);
                        break;
                    case 4:
                        Collections.main(args);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter an integer value.");
                scanner.nextLine(); // Consume invalid input
            }
        }
        scanner.close();
    }
}
