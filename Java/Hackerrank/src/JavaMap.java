/*
You are given a phone book that consists of people's names and their phone number. After that you will
be given some person's name as query. For each query, print the phone number of that person.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {

        Map<String, Integer> phonebook = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        int numOfEntries = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < numOfEntries; i++) {
            String name = scan.nextLine();
            int phoneNumber = scan.nextInt();
            scan.nextLine();
            phonebook.put(name, phoneNumber);
        }

        while(scan.hasNext()) {
            String query = scan.nextLine();
            if(phonebook.containsKey(query)){
                System.out.println(query + "=" + phonebook.get(query));
            } else {
                System.out.println("Not found");
            }

        }


    }

}
