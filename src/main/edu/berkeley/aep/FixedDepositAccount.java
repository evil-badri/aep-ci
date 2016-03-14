package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

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
        return principal * (Math.pow((1 + annualRate/100), termInYears) - 1);
    }

    public List<Double> interestScheduleForTerms(int terms) {
        List result = new ArrayList();
        for(int i=1; i <= terms; i++) {
            result.add(i-1, interestAt(i));
        }
        return result;
    }}
