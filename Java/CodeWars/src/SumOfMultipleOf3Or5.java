public class SumOfMultipleOf3Or5 {

    public int solution(int number) {

        // P - number
        // R - sum
        // E - 23
        // P

    /*
      iterate over numbers until parameter
      if a number is multiple of 3 or 5, add it to sum
      return sum
    */

        int sum = 0;

        for(int i = 1; i < number; i++) {
            if( i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        SumOfMultipleOf3Or5 sum = new SumOfMultipleOf3Or5();

        System.out.println(sum.solution(23));
    }
}
