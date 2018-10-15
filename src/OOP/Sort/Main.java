package OOP.Sort;

import java.util.Arrays;

public class Main {
    private static Object toString(Object[] object){
        return Arrays.toString(object);
    }
    public Object [] test(Object[] object){
        Sort sort = new Sort();
        sort.sort(object);
        return object;
    }

    public static void main(String[] args) {
        Sort sort = new Sort();

        System.out.println(toString(sort.sort(new String [] {"B", "C", "method"})));
        System.out.println(toString(sort.sort(new String [] {"ACA", "ABA", "ABC"})));
        System.out.println(toString(sort.sort(new Integer [] {3, 2 , 1})));
        System.out.println(toString(sort.sort(new Object [] {33, 32 , 31})));
        System.out.println(toString(sort.sort(new Double [] {3.3, 3.2 , 3.1})));
        System.out.println(toString(sort.sort(new Object [] {true, true , false})));
    }
}
