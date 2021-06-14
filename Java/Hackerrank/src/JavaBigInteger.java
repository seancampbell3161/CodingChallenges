import java.math.BigInteger;
import java.util.*;

/*
Use the power of Java's BigInteger class and solve this problem.
Output two lines. The first line should contain a + b, and the second line should
contain a x b. Don't print any leading zeros.
 */

public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigInteger userNum1 = new BigInteger(scan.next());
        BigInteger userNum2 = new BigInteger(scan.next());

        System.out.println(userNum1.add(userNum2));
        System.out.println(userNum1.multiply(userNum2));
    }
}
