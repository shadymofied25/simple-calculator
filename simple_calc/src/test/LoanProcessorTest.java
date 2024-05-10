
package loan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoanProcessorTest {
    private final LoanProcessor loanProcessor = new LoanProcessor();

    @Test
    public void testCalculateMonthlyPayment() {
        double loanAmount = 100000;
        double annualInterestRate = 5;
        int loanTermYears = 30;
        double monthlyPayment = loanProcessor.calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermYears);
        assertEquals(536.82, monthlyPayment, 0.01);
    }
}
