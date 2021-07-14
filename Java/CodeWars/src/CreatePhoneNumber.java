public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],
                numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }

    public static void main(String[] args) {

        CreatePhoneNumber test = new CreatePhoneNumber();
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(test.createPhoneNumber(array));
    }
}
