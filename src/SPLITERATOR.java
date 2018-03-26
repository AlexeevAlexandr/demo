import java.util.*;

public class SPLITERATOR {
    public static void main (String args []){
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.5);
        list.add(2.5);
        list.add(3.5);

        Spliterator<Double> spl = list.spliterator();//tryAdvance - do operation while list have symbols
        while (spl.tryAdvance(System.out::println));

        spl = list.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spl.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
        spl = sqrs.spliterator();
        spl.forEachRemaining(System.out::println);//forEachRemaining - do operation above each symbol



    }
}
