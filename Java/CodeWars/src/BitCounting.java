public class BitCounting {

    public static int countBits(int n) {
        int count = 0;
        String[] bitArray = Integer.toBinaryString(n).split("");
        for(String s : bitArray) {;
            if(s.equals("1")) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
