public class found_needle {
    public static void main(String [] args) {
        Object[] my_array = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        String s = "needle";
        int i = 0;
        int t = java.util.Arrays.asList(my_array).indexOf(s);
        try {
            do {
                if (my_array[i] == s) break;
                else i = i + 1;
            } while (i < my_array.length);
            String a = (my_array[i] == s) ? "Found the "+s+" at position "+(t+1) : "Not found";
            System.out.println(a);
        }catch(ArrayIndexOutOfBoundsException e){System.out.println("Not found");}
    }
}