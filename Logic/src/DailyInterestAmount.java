import java.util.ArrayList;
import java.util.List;

/**
 * Created by ensign on 7/10/16.
 */
public class DailyInterestAmount extends BaseMethods {

    public DailyInterestAmount(){}

    @Override
    public Loan figureOutLoanToPayOff(){
        Loan loan = new Loan();
        for(Loan loan1: getLoanList()){

            if(loan.getCompound() == 0)
            {
                loan = loan1;
            }
            else
            {
                if(loan1.getDailyInterestAmount() > loan.getDailyInterestAmount())
                {
                    loan = loan1;
                }
            }
        }
        return loan;
    }


}
