import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class FormatCurrency {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("US: " + nf.format(payment));
        System.out.printf("%s%s%,.2f", "India: ", "Rs.", payment);
        System.out.println();
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf.format(payment));
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf.format(payment));

    }
}
