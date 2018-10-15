package AAA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Plus a = new Plus("A");
        Minus b = new Minus("B");

        try {
            a.thread.join();
            b.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        StringJoiner list2 = new StringJoiner(":");
        ArrayList<Object> list3 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list2.add("2");
        list2.add("3");
        list2.add("1");
        String string = list2.toString();

        Collections.addAll(list3, string.split(":"));
        for(Object q : list3){
            list.add(Integer.parseInt(q.toString()));
        }
        Collections.sort(list);
        list.forEach(System.out::println);

        new Random().ints().limit(10).sorted().forEach(System.out::println);
    }
}
