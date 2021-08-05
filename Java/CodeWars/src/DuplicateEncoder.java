
/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "("
if that character appears only once in the original string, or ")" if that character appears more than once in the
original string. Ignore capitalization when determining if a character is a duplicate.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateEncoder {

    public static String encode(String word) {
        String result = word;
        Set<String> set = new HashSet<>();
        for(String s : word.split("")) {
            if(!set.add(s)){
                result.replaceAll("e", ")");
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(encode("recede"));
    }
}
