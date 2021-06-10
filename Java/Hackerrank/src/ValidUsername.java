import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The username consists of 8 to 30 characters inclusive.
The username can only contain alphanumeric characters and underscores (_).
The first character of the username must be an alphabetic character
 */

public class ValidUsername {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfUsernames = Integer.parseInt(scan.nextLine());
        Pattern pattern = Pattern.compile("^[aA-zZ]\\w{7,29}");

        for(int i = 0; i < numOfUsernames; i++) {
            String username = scan.nextLine();
            Matcher matcher = pattern.matcher(username);
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
