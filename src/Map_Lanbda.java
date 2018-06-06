import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map_Lanbda {
    public static void main(String[] args) {

        String[] people = {"A","B","C","D","E","F","G","H","I","J"};

        int[] vages = {100,200,300,400,500,600,700,800,900,1000};



        Map<String, Integer> result = IntStream.range(0, people.length).boxed()
                .collect(Collectors.toMap(i -> people[i], i -> vages[i]));
        System.out.println(result);
    }
}
