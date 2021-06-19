import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int numOfElements = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < numOfElements; i++) {
            list.add(scan.nextInt());
        }

        int numOfQueries = scan.nextInt();
        scan.nextLine();

        while(numOfQueries-- > 0) {
            switch(scan.next()) {

                case "Insert":
                    list.add(scan.nextInt(), scan.nextInt());
                    break;

                case "Delete":
                    list.remove(scan.nextInt());
            }
        }

        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
