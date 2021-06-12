import java.util.Scanner;

/*

You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b,
and n values as a single line of  space-separated integers.
The first line contains an integer, t, denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective a, b, and n values
for that query.
 */

public class LoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;
            for(int j = 0; j < n; j++) {
                result += Math.pow(2, j) * b;
                System.out.print(result + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
