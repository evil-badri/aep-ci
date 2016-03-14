package test.edu.berkeley.aep;

import edu.berkeley.aep.FixedDepositAccount;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FixedDepositAccountTest {

    @Test
    public void shouldReturnAmountAndInterestAtTermEnd(){
        assertEquals(108.0, new FixedDepositAccount(100, 8).amountAt(1), 0.001);
    }

}
