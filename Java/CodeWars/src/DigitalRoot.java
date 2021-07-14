import java.util.ArrayList;

public class DigitalRoot {

    public int sum(int num) {

        int sum = 0;
        ArrayList<Integer> sums = new ArrayList<>();

        if(num < 10) {
            return num;
        } else {
            while(num > 0) {
                sums.add(num % 10);
                num /= 10;
            }

            for(Integer i : sums) {
                sum += i;
                System.out.println(i);
            }
            return sum(sum);
        }
    }

    public static void main(String[] args) {

        DigitalRoot test = new DigitalRoot();

        System.out.println(test.sum(942));
    }
}
