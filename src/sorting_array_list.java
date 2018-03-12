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
        for (String word : list) {
            if (!word.substring(0, 1).equals(letter)) {
                redline = true;
                letter = word.substring(0, 1);
            }
            if (redline) {
                System.out.println(word);
            } else {
                System.out.println(word);
            }
            redline = false;
        }
    }
}