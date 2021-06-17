import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need
to tell the number located in xth position of yth line.

Take your input from System.in.

The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on
that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number
of queries. Each query will consist of two integers x and y.
 */

public class JavaArrayList {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> int2dArray = new ArrayList<>();

        int numOfRows = scan.nextInt();

        for(int i = 0; i < numOfRows; i++) {
            int2dArray.add(new ArrayList());
        }

        for(int i = 0; i < numOfRows; i++) {
            int numOfValues = scan.nextInt();

            for(int j = 0; j < numOfValues; j++) {
                int2dArray.get(i).add(scan.nextInt());
            }
        }

        int query = scan.nextInt();

        for (int i = 0; i< query; i++){
            try{
                System.out.println(int2dArray.get(scan.nextInt() - 1).get(scan.nextInt() - 1).toString());
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }



        //Buffered Reader method
        /*
        Scanner scan = new Scanner(System.in);
        String[] strNums;
        String[] indexes;
        ArrayList<Integer> intArray = new ArrayList<>();
        int numOfLines = scan.nextInt();

        for(int i = 0; i < numOfLines; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader index = new BufferedReader(new InputStreamReader(System.in));

            strNums = br.readLine().split("\\s");
            indexes = br.readLine().split("\\s");

            for(String s : strNums) {
                intArray.add(Integer.parseInt(s));
            }

            for(String s : indexes) {
                System.out.print(intArray.get(Integer.parseInt(s)) + " ");
            }
            intArray.clear();
        }

         */
    }
}
