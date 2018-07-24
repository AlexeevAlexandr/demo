package Hash;

import java.util.*;

class demo2 <T, V> {
    private T ob1;
    private V ob2;

    demo2(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}
public class Hash_Map {
    public static void main(String args[]){
        demo2<String, Double> iOb = new demo2<>("Jem Been", 350.25);
        demo2<String, Double> iOb2 = new demo2<>("Jon Connor", 135.78);

            HashMap<String, Double> hm = new HashMap<>();
            hm.put(iOb.getob1(), iOb.getob2());
            hm.put(iOb2.getob1(), iOb2.getob2());

            Set<Map.Entry<String, Double>> set = hm.entrySet();
            for (Map.Entry<String, Double> me : set) {
                System.out.print(me.getKey() + ":\t");
                System.out.println(me.getValue());
            }
            System.out.println();

            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            double b = sc.nextDouble();

            double balance = hm.get(a);
            hm.put(a, balance + b);
            for (Map.Entry<String, Double> me : set) {
                System.out.print(me.getKey() + ":\t");
                System.out.println(me.getValue());
            }
        }
    }

