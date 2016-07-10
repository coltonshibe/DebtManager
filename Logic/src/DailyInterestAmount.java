import java.util.ArrayList;
import java.util.List;

/**
 * Created by ensign on 7/10/16.
 */
public class DailyInterestAmount {

    private List<Loan> loanList = new ArrayList<>();

    public DailyInterestAmount(){}

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }
}
