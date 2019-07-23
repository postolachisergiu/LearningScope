package com.exam;

public class TestEmp {
    public static void main(String[] args) {
        Empl firstEmpl = new Empl();
        Empl secondEmpl = new Empl();
        Empl.bankVault = 10;
        Empl.bankVault = 20;
        System.out.println(Empl.bankVault);
        System.out.println(Empl.bankVault);
        System.out.println(Empl.bankVault);
        System.out.println(Empl.MAX_AGE);
        System.out.println(Empl.getBankVaultValue());
        System.out.println(Empl.interest(2.5, 7.6, 6.3));

        System.out.println(Empl.averageOfFirst100Integers());


        Empl emp = null;
        System.out.println(Empl.bankVault);
        System.out.println(Empl.getBankVaultValue());
    }
}
