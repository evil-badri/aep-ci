package edu.berkeley.aep;

import edu.berkeley.aep.FixedDepositAccount;
import junit.framework.Assert;
import org.junit.Test;

import java.util.DoubleSummaryStatistics;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FixedDepositAccountTest {

    @Test
    public void shouldReturnAmountAndInterestAtTermEnd(){
        assertEquals(108.0, new FixedDepositAccount(100, 8).amountAt(1), 0.001);
    }

    @Test
    public void shouldDisplayInterestSchedule() {
        FixedDepositAccount account = new FixedDepositAccount(100, 8);
        List<Double> schedule = account.interestScheduleForTerms(5);
        assertEquals(8.0, schedule.get(0), 0.001);
        assertEquals(16.64, schedule.get(1), 0.001);
    }
}
