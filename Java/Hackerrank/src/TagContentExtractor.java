import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of
well-organized tags meeting the following criterion:

The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts
with an h1 tag and ends with a non-matching h2 tag.

Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>,
contents is valid but invalid is not valid.

Tags can consist of any printable characters.
 */

public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfLines = Integer.parseInt(scan.nextLine());
        while(numOfLines <= 0 || numOfLines > 100) {
            numOfLines = Integer.parseInt(scan.nextLine());
        }
        //Pattern pattern = Pattern.compile("^<(\\w+)>|<(\\w+)>\\w*</\\2></\\1>+$");
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        for(int i = 0; i < numOfLines; i++) {
            boolean matchFound = false;
            String userString = scan.nextLine();
            Matcher matcher = pattern.matcher(userString);
            while(matcher.find()) {
                System.out.println(matcher.group(2));
                matchFound = true;
            }
            if(!matchFound) {
                System.out.println("None");
            }
        }

    }
}
