public class find_value_in_array2 {
    private static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (V aY : y)
            if (x.equals(aY))
                return true;
        return false;
    }

    public static void main(String args[]) {

        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("Чиcлo 2 содержится в массиве nums ");
        if (!isIn(7, nums))
            System.out.println("Чиcлo 7 отсутствует в массиве nums ");

        System.out.println();

        String strs[] = {"один", "двa", "три", "четыре", "пять"};
        if (isIn("двa", strs))
            System.out.println("двa содержится в ма ссиве strs");
        if (!isIn("ceмь", strs))
            System.out.println("ceмь отсутствует в ма ссиве strs");
    }
}