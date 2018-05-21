import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution2 {
    public static void main (String args[]) {
        int[] A = new int[]{1, 7, 3, 4, 1, 2,6};
        int sum2 = IntStream.of(A).sum();
        if(sum2<=0){System.out.println(1);}
        Arrays.sort(A);
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        int [] ints = list.stream().mapToInt(Integer::intValue).toArray();
        int max = ints[ints.length -1];
        int min = ints[0];
        int sum = Arrays.stream(ints).sum();
        int actual = (((max*(max+1))/2)-min+1);
        int x=(actual - sum);
        if(x==0){System.out.println(ints.length+1);}
        else{System.out.println(x);}
    }
}