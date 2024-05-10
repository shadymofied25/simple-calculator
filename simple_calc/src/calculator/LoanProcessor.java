
package calculator;

public class LoanProcessor {
    public double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTermYears) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfPayments = loanTermYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        return monthlyPayment;
    }
}
