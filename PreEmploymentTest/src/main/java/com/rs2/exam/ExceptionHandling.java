package com.rs2.exam;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            performOperations(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (PrimeNumbersException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    /**

     Performs arithmetic operations (sum, difference, product, quotient) on two input numbers.

     Throws a PrimeNumbersException if both input numbers are prime numbers.

     @param num1 the first input number

     @param num2 the second input number

     @throws PrimeNumbersException if both input numbers are prime numbers
     */
    public static void performOperations(int num1, int num2) throws PrimeNumbersException {
        if (isPrime(num1) && isPrime(num2)) {
            throw new PrimeNumbersException("Both numbers are prime numbers.");
        }
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
        System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
        System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
    }
    /**
     Returns a boolean indicating whether a given number is prime or not.
     @param number the number to check for primality
     @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return !java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(number)).anyMatch(n -> number % n == 0);
    }
}
