import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch (InputMismatchException err) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException err) {
            System.out.println(err);
        }
    }
}
