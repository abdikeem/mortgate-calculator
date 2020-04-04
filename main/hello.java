package main;
import java.text.NumberFormat;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int Principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberofPayments = years * MONTHS_IN_YEARS;

         double mortgate = Principal * (monthlyInterest * Math.pow(1 + monthlyInterest , numberofPayments)/(Math.pow(1+ monthlyInterest , numberofPayments)-1));
         String mortgateFormatted = NumberFormat.getCurrencyInstance().format(mortgate);
        System.out.println("mortgate: " + mortgateFormatted);

    }
}
 