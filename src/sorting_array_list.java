import java.util.*;

public class sorting_array_list {
    public static void main(String args[]) {
        //sort list on all letters
        ArrayList<String> list = new ArrayList<>();
        list.add("Novosad");
        list.add("Alexeev");
        list.add("Potapav");
        list.add("Navosad");
        list.add("Alaxaev");
        list.add("Patapov");

        Collections.sort(list);
        String letter = list.get(0).substring(0, 1);
        boolean redline = true;
        System.out.print("List:\t");
        for (String word : list) {
            if (!word.substring(0, 1).equals(letter)) {
                redline = true;
                letter = word.substring(0, 1);
            }
            if (redline) {
                System.out.print(word+" ");
            } else {
                System.out.print(word+" ");
            }
            redline = false;
        }
        System.out.println();

        TreeSet<String> ts = new TreeSet<>(list);//sort array
        String string = String.valueOf(ts)
                .replaceFirst("]", "")
                .replaceFirst("\\[", "")
                .replace(",", "");
        System.out.println("Array:\t" + string);
    }
}