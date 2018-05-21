import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class convert_date_12_to_24_format {
    public static void main (String args []){
        String q = "8:35:29 pm";
        DateFormat readFormat = new SimpleDateFormat( "hh:mm:ss aa");
        DateFormat writeFormat = new SimpleDateFormat( "HH:mm:ss");
        Date date = null;
        try {
            date = readFormat.parse(q);
        } catch (ParseException e){e.printStackTrace();}
        if (date != null) {
            String formattedDate = writeFormat.format(date);
            System.out.println(formattedDate);
        }
    }
}