import java.util.*;

class address{
    private String name, street, city, state, code;
    address (String n, String s, String c, String st, String cd){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    @Override
    public String toString(){
        return name +"\n"+street+"\n"+city+" "+state+" "+code;
    }
}
public class Linked_List {
    public static void main (String args [] ){
        LinkedList<address> ml = new LinkedList<>();
        ml.add(new address("Alexeev Alexandr", "Bestujeva", "Kiev", "Ukraine", "61801"));
        ml.add(new address("Novosad Roman", "Bestujeva", "Kiev", "Ukraine", "635561"));

        for(address element : ml)
            System.out.println(element+"\n");
    }
}
