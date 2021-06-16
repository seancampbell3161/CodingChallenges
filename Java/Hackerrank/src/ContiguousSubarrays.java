import java.util.Scanner;

/*
Print the number of contiguous subarrays of  having negative sums.
 */

public class ContiguousSubarrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numOfDigits = scan.nextInt();
        int[] intArray = new int[numOfDigits];
        int numOfNegativeSums = 0;

        for(int i = 0; i < numOfDigits; i++) {
            intArray[i] = scan.nextInt();
        }

        for(int i = 0; i < intArray.length; i++) {
            int sum = 0;
            for(int j = i; j < numOfDigits; j++) {
                sum += intArray[j];
                if(sum < 0) {
                    numOfNegativeSums++;
                }
            }
        }
        System.out.println(numOfNegativeSums);
    }
}
