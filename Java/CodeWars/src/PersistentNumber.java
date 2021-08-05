/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
which is the number of times you must multiply the digits in num until you reach a single digit.
 */

public class PersistentNumber {
    public static int persistence(long n) {
        int count = 0;
        while(n >= 10) {
            n = getDigits(n);
            count++;
        }
        return count;
    }
    public static long getDigits(long n) {
        int result = (int) n % 10;
        while((n /= 10) > 0) {
            result *= n % 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(persistence(327));
    }
}
