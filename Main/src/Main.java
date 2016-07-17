import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main () {}


    public static void main(String[] args) {

        DailyInterestAmount dailyInterestAmount = new DailyInterestAmount();
        InterestRate interestRate = new InterestRate();
        Data data = new Data();
        dailyInterestAmount.setLoanList(data.getData());

        data = new Data();
        interestRate.setLoanList(data.getData());

        interestRate.orderLoans();

        dailyInterestAmount.setPaymentAmount(500.00);
        interestRate.setPaymentAmount(500.00);

        dailyInterestAmount.setPaymentRateInDays(7);
        interestRate.setPaymentRateInDays(7);

        System.out.println(dailyInterestAmount.getBeginningTotal()) ;
        System.out.println(interestRate.getBeginningTotal()) ;

        dailyInterestAmount.simulate();
        interestRate.simulate();
        System.out.println(dailyInterestAmount.getTotalAmountPaid());
        System.out.println(interestRate.getTotalAmountPaid());

    }

}
