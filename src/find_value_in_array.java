public class find_value_in_array {
    public static void main(String args[]) {
        Object[] haystack = {"needle2", 1, "needle"};
        for (int i = 0; i < haystack.length; i++)
            if (haystack[i].equals("needle"))
                System.out.print("found the needle at position " + (i + 1));
    }
}


