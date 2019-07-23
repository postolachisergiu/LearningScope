package com.exam;

public class Empl {
    //define constants
    public static final int MIN_AGE = 20;
    public static final int MAX_AGE = 70;
    static int bankVault;
    String name;

    static int getBankVaultValue() {
        return bankVault;
    }

    static double interest(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    static double averageOfFirst100Integers() {
        int sum = 0;
        for (int i = 0; i <= 100; ++i) {
            sum += i;
        }
        return sum / 100;
    }

}
