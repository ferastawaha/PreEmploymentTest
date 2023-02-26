package com.rs2.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest  {

    @Test
    void testIsPrimeWithPrimeNumber() {
        Assertions.assertTrue(ExceptionHandling.isPrime(7));
    }

    @Test
    void testIsPrimeWithCompositeNumber() {
        Assertions.assertFalse(ExceptionHandling.isPrime(10));
    }

    @Test
    void testIsPrimeWithNegativeNumber() {
        Assertions.assertFalse(ExceptionHandling.isPrime(-10));
    }

    @Test
    void testPerformOperationsWithNonPrimeNumbers() throws PrimeNumbersException {
        ExceptionHandling.performOperations(2, 4);
    }

    @Test
    void testPerformOperationsWithBothPrimeNumbers() {
        Exception e = Assertions.assertThrows(PrimeNumbersException.class, () -> ExceptionHandling.performOperations(7, 11));
        Assertions.assertEquals("Both numbers are prime numbers.", e.getMessage());
    }

    @Test
    void testPerformOperationsWithDivideByZero() {
        Exception e = Assertions.assertThrows(ArithmeticException.class, () -> ExceptionHandling.performOperations(2, 0));
        Assertions.assertEquals("/ by zero", e.getMessage());
    }
}