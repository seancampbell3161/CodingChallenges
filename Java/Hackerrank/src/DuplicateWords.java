import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scan = new Scanner(System.in);
        int numOfSentences = Integer.parseInt(scan.nextLine());

        while(numOfSentences-- > 0) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            while(matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(input);
        }
        scan.close();
    }
}
