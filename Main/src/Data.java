import java.util.ArrayList;
import java.util.List;

/**
 * Created by ensign on 7/17/16.
 */
public class Data {

    public Data () {}

    public List<Loan> getData () {
        List<Loan> loans = new ArrayList<>();

        //Car Loan
        Loan loan = new Loan();
        loan.setPrincipalBalance(14206.25);
        loan.setCompound(365);
        loan.setInterestRate(0.0345);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-01
        loan = new Loan();
        loan.setPrincipalBalance(1750.00);
        loan.setCompound(365);
        loan.setInterestRate(0.034);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-02
        loan = new Loan();
        loan.setPrincipalBalance(1000.00);
        loan.setUnpaidInterest(327.33);
        loan.setCompound(365);
        loan.setInterestRate(0.068);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-03
        loan = new Loan();
        loan.setPrincipalBalance(3021.00);
        loan.setCompound(365);
        loan.setInterestRate(0.034);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-04
        loan = new Loan();
        loan.setPrincipalBalance(2479.00);
        loan.setCompound(365);
        loan.setUnpaidInterest(732.81);
        loan.setInterestRate(0.068);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-05
        loan = new Loan();
        loan.setPrincipalBalance(1618.00);
        loan.setCompound(365);
        loan.setInterestRate(0.034);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-06
        loan = new Loan();
        loan.setPrincipalBalance(4882.00);
        loan.setUnpaidInterest(940.77);
        loan.setCompound(365);
        loan.setInterestRate(0.068);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);


        //Loan 1-07
        loan = new Loan();
        loan.setPrincipalBalance(7500.00);
        loan.setUnpaidInterest(766.53);
        loan.setCompound(365);
        loan.setInterestRate(0.0386);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);


        //Loan 1-08
        loan = new Loan();
        loan.setPrincipalBalance(5500.00);
        loan.setCompound(365);
        loan.setInterestRate(0.0466);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-09
        loan = new Loan();
        loan.setPrincipalBalance(2000.00);
        loan.setUnpaidInterest(160.02);
        loan.setCompound(365);
        loan.setInterestRate(0.0466);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        //Loan 1-10
        loan = new Loan();
        loan.setPrincipalBalance(1250.00);
        loan.setUnpaidInterest(38.60);
        loan.setCompound(365);
        loan.setInterestRate(0.0429);
        loan.setStartDate(DateUtil.getCurrentDate());
        loans.add(loan);

        return loans;
    }
}
