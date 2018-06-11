import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class pojo{
    private static String formattedDate;
    private static String name;
    private static String city;
    private static String country;
    private static String number;
    pojo(String name, String city, String country, int number, String date) throws ParseException {
        pojo.name =name;
        pojo.city =city;
        pojo.country =country;
        pojo.number =String.valueOf(number+1);
        DateFormat readFormat = new SimpleDateFormat( "dd.MM.yyyy");
        DateFormat writeFormat = new SimpleDateFormat( "dd.MM.yyyy");
        Date x = readFormat.parse(date);
        formattedDate = writeFormat.format(x);
        Calendar cal = Calendar.getInstance();
        Date w = readFormat.parse(formattedDate);
        cal.setTime(w);
        cal.add(Calendar.DATE, 1);
        formattedDate = writeFormat.format(cal.getTime());
    }
    public static String demo() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(";");
        sb.append(city).append(";");
        sb.append(country).append(";");
        sb.append(number).append(";");
        sb.append(formattedDate);
        return String.valueOf(sb);
    }
}
class POJO_CSV {
    public static void main(String[] args){
        try(BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:/Documents and Settings/Fart/Рабочий стол/test.new.csv"));
            BufferedReader br = new BufferedReader(new FileReader("C:/Documents and Settings/Fart/Рабочий стол/test.csv"))) {
            Scanner sc = new Scanner(br);
            writer1.append(sc.nextLine()).append("\n");
            while (sc.hasNextLine()) {
                String[] splitString = sc.nextLine().split(";");
                new pojo(splitString[0], splitString[1], splitString[2], Integer.parseInt(splitString[3]), splitString[4]);
                writer1.append(pojo.demo()).append("\n");
                System.out.println(pojo.demo());
            }
        }catch(IOException | ParseException e){e.printStackTrace();}

    }
}

