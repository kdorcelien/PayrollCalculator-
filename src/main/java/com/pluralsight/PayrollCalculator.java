package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner payroll = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = payroll.nextLine();

        System.out.print("Please enter hours worked: ");
        int hours = payroll.nextInt();
        payroll.nextLine();

        System.out.print("Please enter hourly rate: ");
        double pay = payroll.nextDouble();
        payroll.nextLine();

        System.out.printf("%d * %d = %d ", hours, pay,(hours * pay));





    }
}
