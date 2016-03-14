package edu.berkeley.aep;

public class FixedDepositAccount {

    private final double principal;
    private final double annualRate;

    public FixedDepositAccount(double principal, double annualRate) {
        this.principal = principal;
        this.annualRate = annualRate;
    }

    public double amountAt(int termInYears) {
        return principal + interestAt(termInYears);
    }

    private double interestAt(int termInYears) {
        return (principal * annualRate * termInYears)/100;
    }
}
