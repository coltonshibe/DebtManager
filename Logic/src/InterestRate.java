import java.util.ArrayList;
import java.util.List;

public class InterestRate {

    private List<Loan> loanList = new ArrayList<>();

    public InterestRate() {
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

}
