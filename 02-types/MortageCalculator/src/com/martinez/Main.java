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

        // Static inputs for now then test
        // M = ?
        // P = $100,000
        // r = 5.5%
        // n = 30 years * 12 = 360

        // Static data
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Testing data
        final int PRINCIPAL = 100_000;
        final float ANNUAL_INTEREST = 5.5F;
        final int PERIOD_YEARS = 30;


        // Monthly Interest
        float monthlyInterest = ANNUAL_INTEREST / PERCENT / MONTHS_IN_YEAR;
        System.out.println("Monthly Interest rate is: " + monthlyInterest);

        // # of Payments = PERIOD_YEARS * MONTHS_IN_YEAR
        int numberPayment = PERIOD_YEARS * MONTHS_IN_YEAR;
        System.out.println("Total Payments through loan: " + numberPayment);

        // Mortage
        double mortage = PRINCIPAL * (monthlyInterest * Math.pow(1 + monthlyInterest, numberPayment)
                                    / (Math.pow(1 + monthlyInterest, numberPayment) - 1));
        System.out.println("Mortage bill is: " + mortage);


    }
}
