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

        String string = String.valueOf(list)
                .replaceFirst("]", "")
                .replaceFirst("\\[", "")
                .replace(",", "");
        System.out.print("Input list: "+string+"\n");

        //sorting list method 1
        Collections.sort(list);
        String letter = list.get(0).substring(0, 1);
        boolean read = true;
        System.out.print("sort list:\t");
        for (String word : list) {
            if (!word.substring(0, 1).equals(letter)) {
                read = true;
                letter = word.substring(0, 1);
            }
            System.out.print(read ? word+" " : word+" ");
            read = false;
        }
        System.out.println();

        //sorting list method 2
        System.out.print("sort list2: ");
       TreeSet<String> ts = new TreeSet<>(list);//sort array
        String str = String.valueOf(ts)
                .replaceFirst("]", "")
                .replaceFirst("\\[", "")
                .replace(",", "");
        System.out.println(str);
    }
}