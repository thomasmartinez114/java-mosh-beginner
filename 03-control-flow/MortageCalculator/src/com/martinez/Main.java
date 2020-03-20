package com.martinez;

import java.util.Scanner;
import java.text.NumberFormat;


public class Main {

    public static void main(String[] args) {
	    // Ask user for:
        // Principal
        // Annual Interest Rate (divide by 100 then divide by 12) to get monthly interest
        // Period (Years)
        // Return Mortage rate (monthly): $###.##
        // Formula used is:
        // M = (P(r(1+r)^n)/((1+r)^n)-1)

        /* Testing Data
        // Static inputs for now then test
        // Testing data
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        final int PRINCIPAL = 100_000;
        final float ANNUAL_INTEREST = 5.5F;
        final int PERIOD_YEARS = 30;
        // Monthly Interest
        float monthlyInterest = ANNUAL_INTEREST / PERCENT / MONTHS_IN_YEAR;
        // System.out.println("Monthly Interest rate is: " + monthlyInterest);

        // # of Payments = PERIOD_YEARS * MONTHS_IN_YEAR
        int numberPayment = PERIOD_YEARS * MONTHS_IN_YEAR;
        // System.out.println("Total Payments through loan: " + numberPayment);

        // Mortage
        double mortage = PRINCIPAL
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberPayment)
                / (Math.pow(1 + monthlyInterest, numberPayment) - 1));
        // System.out.println("Mortage bill is: " + mortage);

        // Format the mortage into currency
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage Payment is: " + mortageFormatted);
        */

        //////////////////////////////////////////////////////////
        // User input

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;

        Scanner scanner = new Scanner(System.in);

        // Principal
        while (true) {
            System.out.print("Principal/Loan: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 - 1,000,000.");
        }

        // Interest Rate
        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
        }
            System.out.println("Enter a number between 1 - 30.")
        }
        // Period (Years)
        System.out.print("Length of Loan (Years): ");
        byte years = scanner.nextByte();
        int numPayments = MONTHS_IN_YEAR * years;
        // System.out.println(numPayments);

        // Mortage Rate
        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)
                / (Math.pow(1 + monthlyInterest, numPayments) - 1));

        // Format the Mortage into currency
        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage is: " + formattedMortage);
    }
}
