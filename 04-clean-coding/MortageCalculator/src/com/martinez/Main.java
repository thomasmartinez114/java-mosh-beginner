// Ask user for:
// Principal
// Annual Interest Rate (divide by 100 then divide by 12) to get monthly interest
// Period (Years)
// Return Mortage rate (monthly): $###.##
// Formula used is:
// M = (P(r(1+r)^n)/((1+r)^n)-1)

package com.martinez;

import java.util.Scanner;
import java.text.NumberFormat;


public class Main {

    public static void main(String[] args) {

        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal/Loan: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 - 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.println("Enter a number between 1 - 30.");
        }

        while (true) {
        System.out.print("Length of Loan (Years): ");
        years = scanner.nextByte();
        if (years >= 1 && years <= 30)
            break;

        System.out.println("Enter a number between 1 - 30.");
    }

        double mortage = calculateMortage(principal, annualInterest, years);

        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage is: " + formattedMortage);
    }

    public static double calculateMortage(
            int principal,
            float annualInterest,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numPayments = (short) (MONTHS_IN_YEAR * years) ;

        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)
                / (Math.pow(1 + monthlyInterest, numPayments) - 1));

        return mortage;
    }
}
