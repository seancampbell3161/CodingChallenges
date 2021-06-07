import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
 */

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfInputs = scan.nextInt();
        scan.nextLine();
        while(numOfInputs > 0) {
            String regexInput = scan.nextLine();
            try {
                Pattern.compile(regexInput);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            numOfInputs--;
        }
        scan.close();
    }
}
