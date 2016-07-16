public class InterestRate  extends BaseMethods {

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
}
