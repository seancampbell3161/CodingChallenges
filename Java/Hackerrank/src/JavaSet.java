import java.util.HashSet;
import java.util.Scanner;

/*
You are given n pairs of names as a string.

After taking each pair as input, you need to print number of unique pairs you currently have.
 */

public class JavaSet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        int numOfPairs = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < numOfPairs; i++) {
            String userInput = scan.nextLine();
            set.add(userInput);
        }

        System.out.println(set.size());

    }
}
