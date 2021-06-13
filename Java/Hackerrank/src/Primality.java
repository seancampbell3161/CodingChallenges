import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 */

public class Primality {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bi = new BigInteger(n);
        if(bi.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        bufferedReader.close();
    }
}
