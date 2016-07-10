import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Integer daysBetweenDates(Date date1, Date date2)
    {
        return (int)( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
    }

    public static Date setDateFromString (String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date date = new Date();
        try{
            date = sdf.parse(dateString);

        }catch (Exception e){
            System.out.print("Error: Could not parse Date " + dateString );
        }
        return date;
    }

    public static Date getCurrentDate()
    {
        Calendar cal = Calendar.getInstance();
        return cal.getTime();
    }


}
