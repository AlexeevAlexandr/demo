import java.util.Arrays;

public class first_last_number_from_string {
    public static void main (String args []){
        String str="8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        int[] ints = Arrays.stream(str.split("[ ]"))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(ints);
        System.out.print(ints[ints.length-1]+" "+ints[0]);
    }
}
//convert string to int, sort and print first and last number