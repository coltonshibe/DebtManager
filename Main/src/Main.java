import java.util.Date;

public class Main {
    public Main () {}
    public static void main(String[] args) {
        Date date1 = DateUtil.setDateFromString("24092011");

        System.out.println(DateUtil.daysBetweenDates(date1, DateUtil.getCurrentDate()));
    }
}
