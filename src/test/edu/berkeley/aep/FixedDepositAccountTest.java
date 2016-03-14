package test.edu.berkeley.aep;

import edu.berkeley.aep.FIxedDepositAccount;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FixedDepositAccountTest {

    @Test
    public void shouldReturnAmountAndInterestAtTermEnd(){
        assertEquals(108.0, new FIxedDepositAccount(100, 8).amountAt(1));
    }

}
