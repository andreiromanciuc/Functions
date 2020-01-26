package org.fasttrackit;

import java.util.Scanner;

public class MonthstoPayOffaCreditCard {

    public void cardPay() {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce daily rate");
        double i = scanner1.nextDouble()/365;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce balance rate");
        double b = scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduce monthly payment");
        double p = scanner3.nextDouble();

        double months = (-1/30)*(Math.log(1+b/p*(1-Math.pow((1+i),30)))/Math.log(1+i));
        months = (int)months;

        System.out.println("It will take you "+ months +" months to pay off this card.");
    }

}
