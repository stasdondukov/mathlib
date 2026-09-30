package mathlib;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
class MathOperationsTest {
    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1L, MathOperations.factorial(0));
    }
    @Test
    void factorialOfFiveIs120() {
        assertEquals(120L, MathOperations.factorial(5));
    }
    @Test
    void factorialOfTwentyFitsIntoLong() {
        assertEquals(2432902008176640000L, MathOperations.factorial(20));
    }
    @Test
    void factorialOfNegativeNumberThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathOperations.factorial(-1));
    }
    @Test
    void gcdOfPositiveNumbers() {
        assertEquals(6L, MathOperations.gcd(12, 18));
    }
    @Test
    void gcdWithZero() {
        assertEquals(7L, MathOperations.gcd(0, 7));
        assertEquals(7L, MathOperations.gcd(7, 0));
        assertEquals(0L, MathOperations.gcd(0, 0));
    }
    @Test
    void gcdIgnoresSignOfArguments() {
        assertEquals(12L, MathOperations.gcd(-24, 36));
        assertEquals(12L, MathOperations.gcd(24, -36));
    }
    @Test
    void lcmOfPositiveNumbers() {
        assertEquals(12L, MathOperations.lcm(4, 6));
        assertEquals(42L, MathOperations.lcm(21, 6));
    }
    @Test
    void lcmWithZeroIsZero() {
        assertEquals(0L, MathOperations.lcm(0, 5));
        assertEquals(0L, MathOperations.lcm(5, 0));
        assertEquals(0L, MathOperations.lcm(0, 0));
    }
    @Test
    void lcmIgnoresSignOfArguments() {
        assertEquals(12L, MathOperations.lcm(-4, 6));
    }
    @Test
    void isPrimeReturnsTrueForPrimes() {
        assertTrue(MathOperations.isPrime(2));
        assertTrue(MathOperations.isPrime(3));
        assertTrue(MathOperations.isPrime(17));
        assertTrue(MathOperations.isPrime(97));
        assertTrue(MathOperations.isPrime(7919));
    }
    @Test
    void isPrimeReturnsFalseForCompositeAndNonPositiveNumbers() {
        assertFalse(MathOperations.isPrime(0));
        assertFalse(MathOperations.isPrime(1));
        assertFalse(MathOperations.isPrime(-7));
        assertFalse(MathOperations.isPrime(4));
        assertFalse(MathOperations.isPrime(100));
        assertFalse(MathOperations.isPrime(561));
    }
}


