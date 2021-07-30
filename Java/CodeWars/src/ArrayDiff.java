/*
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.
 */

import java.util.ArrayList;

public class ArrayDiff {

    public static int[] arrayDif(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int n : a) {
            result.add(n);
        }

        for(int n : b) {
            while(result.contains(n)) {
                result.remove(result.indexOf(n));
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 2};
        int[] b = {2};

        int[] result = arrayDif(a, b);
        for(int n : result) {
            System.out.println(n);
        }
    }
}
