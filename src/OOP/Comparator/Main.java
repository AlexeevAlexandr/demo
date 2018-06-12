package OOP.Comparator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Comparator comparator = new ToStringComparator();


        BubleSorter sorter = new BubleSorter(comparator);

        System.out.println(Arrays.toString(sorter.sort(new Integer[]{123, 45, 3, 6, 12345, 456})));
        System.out.println(Arrays.toString(sorter.sort(new String[]{"sekfhseflj", "ds", "sdseee", "d", "dsds", "y"})));
        System.out.println(Arrays.toString(sorter.sort(new Boolean[]{true, true, false, true})));
    }
}
