import java.util.*;
class Iterator_demo {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        System.out.print("List original: ");

        Iterator<String> itr = al.iterator();//add space after each element
        while (itr.hasNext())
        {
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

    ListIterator <String> listIterator =al.listIterator();//add + and space after each element
        while(listIterator.hasNext())
        {
            String element = listIterator.next();
            listIterator.set(element+"+");
        }
        System.out.print("List+: ");
        itr = al.iterator();
        while (itr.hasNext())
        {
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.print("List+ reverse: ");//outputting reverse of string
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

