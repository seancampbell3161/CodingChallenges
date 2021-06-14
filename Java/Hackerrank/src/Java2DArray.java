import java.util.Scanner;

public class Java2DArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] intArray = new int[6][6];

        for(int i = 0; i < intArray.length; i ++) {
            for(int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = scan.nextInt();
            }
        }

        int largestSum = 0;

        for(int i = 0; i < intArray.length - 2; i++) {
            for(int j = 0; j < intArray.length - 2; j++) {
                int currentSum = intArray[i][j] + intArray[i][j+1] + intArray[i][j+2] + intArray[i+1][j+1] + intArray[i+2][j] +
                        intArray[i+2][j+1] + intArray[i+2][j+2];
                if(currentSum > largestSum) largestSum = currentSum;
            }

        }

        System.out.println(largestSum);

    }
}
