import java.util.ArrayList;
import java.util.List;

/**
 * Created by ensign on 7/10/16.
 */
public class BaseMethods {

    private List<Loan> loanList = new ArrayList<>();
    private int paymentRateInDays;
    private double paymentAmount;
    private double totalAmountPaid = 0.0;
    private double beginningTotal = 0.0;

    public BaseMethods() {
    }

    public double getBeginningTotal() {
        return beginningTotal;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
        calculateTotalStartingAmount();
    }

    public int getPaymentRateInDays() {
        return paymentRateInDays;
    }

    public void setPaymentRateInDays(int paymentRateInWeeks) {
        this.paymentRateInDays = paymentRateInWeeks;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public double getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(double totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

    private void calculateTotalStartingAmount()
    {
        for(Loan loan1: getLoanList()){
            this.beginningTotal += loan1.getPrincipalBalance();
        }
    }

     protected void compound()
    {
        for(Loan loan1 :getLoanList())
        {
            loan1.addUnpaidInterest();
        }
    }

    public double makePayment(Loan loan)
    {
        if(loan.getPrincipalBalance() < getPaymentAmount())
        {
            this.totalAmountPaid += loan.getPrincipalBalance();
            loan.makePayment(getPaymentAmount());
            return loan.getPrincipalBalance();
        }
        else
        {
            this.totalAmountPaid += getPaymentAmount();
            loan.makePayment(getPaymentAmount());
            return 0.0;
        }


    }

    public Boolean isAllLoansPaidOff()
    {
        Double total = 0.0;

        for(Loan loan1: getLoanList()){
            total += loan1.getPrincipalBalance();
        }

        if(total < 0.0)
        {
            return true;
        }
        return false;
    }

    public Loan figureOutLoanToPayOff(){
        return null;
    }

    public void simulate(){

        boolean paidOffAllLoans = false;
        Integer numberOfDays = 1;
        Integer numberOfWeeks =1;

        while(!paidOffAllLoans)
        {
         if(numberOfDays == 7)
         {
             numberOfWeeks += 1;
         }
            if(numberOfDays.equals(getPaymentRateInDays()))
            {
                double  remainingAmount = 0.0;
                numberOfDays=1;
                Loan loan1 = figureOutLoanToPayOff();
                remainingAmount =  makePayment(loan1);
                if (remainingAmount >= 0.0)
                {
                    makePayment(figureOutLoanToPayOff());
                }
                compound();
                paidOffAllLoans = isAllLoansPaidOff();
            }
            else
            {
                compound();
                numberOfDays += 1;
            }
        }
    }
}
