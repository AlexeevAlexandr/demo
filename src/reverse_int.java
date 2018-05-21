import java.util.Arrays;

public class reverse_int {
    public static void main(String[] str) {
        int count=0;
        int [] q = {6676, 3216, 4063, 8373, 423, 586, 8850, 6762};//reverse this string of int
        int s = q.length;
        int [] reverse = new int [s];
            for (int r=s-1; r >=0; r--) {
                count += 1;
                reverse[r] = q[count-1];
            }
        String str2 = Arrays.toString(reverse)
                .replaceFirst("]", "")
                .replaceFirst("\\[", "")
                .replace(",", "");
        System.out.println(str2);
    }
}