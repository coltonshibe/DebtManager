import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class Loan {

    private Date startDate;
    private Date daysFromLastPayment;
    private Double payoffAmount;
    private Double principalBalance;
    private Integer compound = 0;
    private Double interestRate;
    private Double totalInterestPaid = 0.0;
    private LoanType loanType;
    private Double unpaidInterest = 0.0;

    public Loan () {}

    public LoanType getLoanType() {
        return loanType;
    }

    public void addToTotalInterestPaid(Double amount)
    {
        this.totalInterestPaid += amount;
    }

    public Double getTotalInterestPaid() {
        return totalInterestPaid;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
        setDaysFromLastPayment(startDate);
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

    public Double getUnpaidInterest() {
        return this.unpaidInterest;
    }

    public void clearUnpaidInterest()
    {
        this.unpaidInterest = 0.0;
    }

    public void addUnpaidInterest()
    {
        this.unpaidInterest += getDailyInterestAmount();
    }

    public void makePayment(Double amount){
        Double totalLeft = amount - getUnpaidInterest();
        clearUnpaidInterest();
        setPrincipalBalance((this.principalBalance - totalLeft));
    }

    public Double getDailyInterestAmount()
    {
       return round(((getPrincipalBalance() * getInterestRate())/ (double) getCompound()), 2);
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
