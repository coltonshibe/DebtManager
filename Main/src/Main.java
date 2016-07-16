import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main () {}

    private static List<Loan> loans = new ArrayList<>();
    private static List<Loan> loanss = new ArrayList<>();
    public static void main(String[] args) {
        makeLoans();
        DailyInterestAmount dailyInterestAmount = new DailyInterestAmount();
        InterestRate interestRate = new InterestRate();

        dailyInterestAmount.setLoanList(loans);
        makeLoanss();
        interestRate.setLoanList(loanss);

        dailyInterestAmount.setPaymentAmount(500.00);
        interestRate.setPaymentAmount(500.00);

        dailyInterestAmount.setPaymentRateInDays(7);
        interestRate.setPaymentRateInDays(7);

        dailyInterestAmount.simulate();
        interestRate.simulate();
        System.out.println(dailyInterestAmount.getTotalAmountPaid());
        System.out.println(interestRate.getTotalAmountPaid());

    }


    private static void makeLoans(){

        Loan loan = new Loan();
        loan.setPrincipalBalance(14000.00);
        loan.setCompound(365);
        loan.setInterestRate(0.0345);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        loan = new Loan();
        loan.setPrincipalBalance(7000.00);
        loan.setCompound(365);
        loan.setInterestRate(0.0468);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);


    }
    private static void makeLoanss(){

        Loan loan = new Loan();
        loan.setPrincipalBalance(14000.00);
        loan.setCompound(365);
        loan.setInterestRate(0.0345);
        loan.setStartDate(DateUtil.getCurrentDate());
        loanss.add(loan);

        loan = new Loan();
        loan.setPrincipalBalance(7000.00);
        loan.setCompound(365);
        loan.setInterestRate(0.0468);
        loan.setStartDate(DateUtil.getCurrentDate());
        loanss.add(loan);


    }
}
