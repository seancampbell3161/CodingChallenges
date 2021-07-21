import java.util.HashSet;

/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that
occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and
lowercase) and numeric digits.
 */

public class CountingDuplicates {

    public static int duplicateCount(String text) {

        HashSet<Character> set = new HashSet<>();
        HashSet<Character> result = new HashSet<>();

        for(char c : text.toLowerCase().toCharArray()) {
            if(!set.add(c)) {
                result.add(c);
            }
        }
        return result.size();
    }

    public static void main(String[] args) {

        System.out.println(duplicateCount("banana"));
    }
}
