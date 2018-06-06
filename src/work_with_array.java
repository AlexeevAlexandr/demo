import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class work_with_array {
        public static void main(String[] args) {
            int[] q = new int[10];
            int[] qq = new int[10];
            Arrays.setAll(q, index -> index++);     //filling of array by cycle, lambda expression
            Arrays.setAll(qq, index -> index++);
            int[] result = IntStream.concat(Arrays.stream(q), Arrays.stream(qq)).toArray(); //two arrays in one (type int)


            String[] string1 = {"a", "b", "c"};
            String[] string2 = {"d", "e", "f"};
            String[] result2 = Stream.of(string1, string2).flatMap(Stream::of).toArray(String[]::new); //two arrays in one (type String)

            System.out.println(Arrays.toString(result));
            System.out.println(Arrays.toString(result2));
        }
}
