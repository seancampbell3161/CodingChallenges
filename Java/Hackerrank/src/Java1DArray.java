import java.util.Scanner;

/*
The code in your editor does the following:

Reads an integer from stdin and saves it to a variable, n, denoting some number of integers.
Reads  integers corresponding to a0,a1,a2... from stdin and saves each integer ai to a variable, val.
Attempts to print each element of an array of integers named a.
Write the following code in the unlocked portion of your editor:

Create an array, a, capable of holding n integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array.
For example, the first value must be stored in , the second value must be stored in , and so on.
 */
public class Java1DArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] intArray = new int[n];

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scan.nextInt();
        }

        for(int num : intArray) {
            System.out.println(num);
        }
    }
}
