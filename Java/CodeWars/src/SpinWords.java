
/*
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpinWords {

    public String spinWords(String sentence) {

        List<String> array = Arrays.asList(sentence.split(" "));

        for(int i = 0; i < array.size(); i++) {
            if(array.get(i).length() >= 5) {
                char[] charArray = array.get(i).toCharArray();
                char[] reverseArray = new char[charArray.length];
                int startIndex = 0;
                for(int j = charArray.length - 1; j >= 0; j--) {
                    reverseArray[startIndex] = charArray[j];
                    startIndex++;
                }
                array.set(i, String.copyValueOf(reverseArray));
            }
        }
        return String.join(" ", array);
    }

    public static void main(String[] args) {

        SpinWords test = new SpinWords();

        System.out.println(test.spinWords("Stop spinning my words"));
    }
}
