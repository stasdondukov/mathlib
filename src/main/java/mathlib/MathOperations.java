package mathlib;
public final class MathOperations {
    private MathOperations() {
    }
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative, but was " + n);
        }
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0L;
        }
        return Math.abs(a / gcd(a, b) * b);
    }
    public static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (long candidate = 5; candidate <= n / candidate; candidate += 6) {
            if (n % candidate == 0 || n % (candidate + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}


