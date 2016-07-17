import java.util.ArrayList;
import java.util.List;

public class InterestRate  extends BaseMethods {

    private List<Loan> orderedList = new ArrayList<>();

    public InterestRate() {
    }

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
                if(loan1.getInterestRate() > loan.getInterestRate() && loan1.getPrincipalBalance() > 0.0 && loan.getPrincipalBalance() <= 0.0 )
                {
                    loan = loan1;
                }
            }
        }
        return loan;
    }

    @Override
    public void simulate(){
        boolean paidOffAllLoans = false;
        Integer numberOfDays = 1;

        while(!paidOffAllLoans)
        {
            if(numberOfDays.equals(getPaymentRateInDays()))
            {
                double  remainingAmount = 0.0;
                numberOfDays=1;

                Loan loan1 = getLoanList().get(0);
                if(loan1.getPrincipalBalance() <= 0.0)
                {
                    getLoanList().remove(loan1);
                }
                if(getLoanList().size() > 1 ){
                    loan1 = getLoanList().get(0);
                    remainingAmount =  makePayment(loan1);
                    if (remainingAmount >= 0.0)
                    {
                        makePayment(figureOutLoanToPayOff());
                    }
                    compound();
                }
                else {
                    paidOffAllLoans = true;
                }
            }
            else
            {
                compound();
                numberOfDays += 1;
            }
        }


    }

    public void orderLoans()
    {
            for(int i =0; i < getLoanList().size(); i++){

                Loan _loan = new Loan();

                for (Loan loan1: getLoanList())
                {
                    if (orderedList.contains(loan1))
                    {

                    }
                    else {
                        if(_loan.getInterestRate() == 0.0)
                        {
                            _loan = loan1;
                        }
                        else {

                            if (loan1.getInterestRate().equals(_loan.getInterestRate()))
                            {
                                if(loan1.getPrincipalBalance() > _loan.getPrincipalBalance())
                                {
                                    _loan = loan1;
                                }
                            }
                            else if(loan1.getInterestRate() > _loan.getInterestRate() ){
                                _loan = loan1;
                            }

                        }
                    }
                }

                orderedList.add(_loan);
            }
    }
}
