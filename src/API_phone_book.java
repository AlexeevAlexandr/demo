import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name, phone, email;
    NamePhoneEmail(String n, String p, String e){
        name = n;
        phone = p;
        email = e;
    }
}
class NamePhone{
    String name, phone;
    NamePhone(String n, String p){
        name = n;
        phone = p;
    }
}
public class API_phone_book {
    public static void main (String args []){
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-55-55", "Lary@ukr.net"));
        myList.add(new NamePhoneEmail("Jams", "222-22-22", "Jams@ukr.net"));
        myList.add(new NamePhoneEmail("Mary", "333-33-33", "Mary@ukr.net"));
        myList.forEach((a) -> System.out.println(a.name+" "+a.phone+" "+a.email));
        System.out.println();

        Stream<NamePhone> np = myList.stream().map((a) -> new NamePhone(a.name, a.phone));
        np.forEach((a) -> System.out.println(a.name+" "+a.phone));
        System.out.println();

        Stream<NamePhone> q = myList.stream().filter((a) -> a.name.equals("Larry")).map((a) -> new NamePhone(a.name, a.phone));
        q.forEach((a) -> System.out.println(a.name+" "+a.phone));
        System.out.println();
    }
}
