package edu.berkeley.aep;

// Understands how to convert between different units
public class FIxedDepositAccount {

    private final double principal;
    private final double annualRate;

    public FIxedDepositAccount(double principal, double annualRate) {
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
