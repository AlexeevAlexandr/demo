import java.util.*;
class Array_List_To_Array {
    public static void main(String args[]) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(1);
        al.add(6);
        al.add(7);
        al.add(2);
        al.addLast(3);
        al.add(1,4);
        al.addFirst(5);
        System.out.println("Array: " + al);

        al.remove(3);
        al.removeFirst();
        al.removeLast();
        System.out.println("Array2: " + al);

        al.set(1, 5);//replaces digit 5 to index 1
        System.out.println("Array3: " + al);

        TreeSet<Integer> ts = new TreeSet<>(al);//sort array
        System.out.println("Array4: " + ts);

        System.out.println("Array5: " + ts.subSet(2, 7));//output array from 2 to 7
    }
}