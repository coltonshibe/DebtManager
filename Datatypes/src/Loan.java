import java.util.Calendar;
import java.util.Date;

public class Loan {

    private Date startDate;
    private Date daysFromLastPayment;
    private Double payoffAmount;
    private Double principalBalance;
    private Integer compound;
    private Double interestRate;

    public Loan () {}

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    private LoanType loanType;


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Double getPayoffAmount() {
        return payoffAmount;
    }

    public void setPayoffAmount(Double payoffAmount) {
        this.payoffAmount = payoffAmount;
    }

    public Double getPrincipalBalance() {
        return principalBalance;
    }

    public void setPrincipalBalance(Double principalBalance) {
        this.principalBalance = principalBalance;
    }

    public Integer getCompound() {
        return compound;
    }

    public void setCompound(Integer compound) {
        this.compound = compound;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getDaysFromLastPayment() {
        return daysFromLastPayment;
    }

    public void setDaysFromLastPayment(Date daysFromLastPayment) {
        this.daysFromLastPayment = daysFromLastPayment;
    }
}
