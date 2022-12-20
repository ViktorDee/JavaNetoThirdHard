public class CreditPaymentService {
    public int calculate(int yearsOfLoan) {
        
        float annualPercent = 9.99F;
        int loanMoneyAmount = 1_000_000;
        float monthlyRate = annualPercent / 100 / 12; // Ставка в месяц
        double monthlyPay = loanMoneyAmount * ((monthlyRate * Math.pow((1 + monthlyRate), 12 * yearsOfLoan)) / (Math.pow((1 + monthlyRate), 12 * yearsOfLoan) - 1));
        double totalLoanPayment = 12 * yearsOfLoan * monthlyPay;
        return (int) monthlyPay;
    }
}
