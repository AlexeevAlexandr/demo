import java.util.*;
import java.util.stream.*;
import static java.lang.System.out;

class API_Stream {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
            myList.add(7);
            myList.add(18);
            myList.add(10);
            myList.add(24);
            myList.add(17);
            myList.add(23);
            myList.add(5);
        out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();
        long count = myStream.count();
        out.println("Quantity of elements: " + count);

        myStream = myList.stream();
        Optional<Integer> sum = myStream.reduce((a,b) -> a+b);
        sum.ifPresent(integer -> out.println("Sum of array: " + integer));

        myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);
        minVal.ifPresent(integer -> out.println("Min value: " + integer));

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        maxVal.ifPresent(integer -> out.println("Max value: " + integer));

        Stream<Integer> sortedStream = myList.stream().sorted();
        out.print("Sort list: ");
        sortedStream.forEach(n -> out.print(n + " "));
        out.println();

        Stream<Integer> oddValue = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        out.print("Odd value: ");
        oddValue.forEach(n -> out.print(n + " "));
        out.println();

        Stream<Integer> evenValue = myList.stream().sorted().filter((n) -> (n % 2) != 1);
        out.print("Even value: ");
        evenValue.forEach(n -> out.print(n + " "));
        out.println();

        myStream = myList.stream();
        Optional<Integer> sumOddValue = myStream.filter((n) -> (n % 2) != 0).reduce((a,b) -> {if(b%2 !=0) return a+b; else return a;});
        sumOddValue.ifPresent(integer -> out.println("Sum of odd value: " + integer));

        myStream = myList.stream();
        Optional<Integer> sumEventValue = myStream.filter((n) -> (n % 2) == 0).reduce((a,b) -> {if(b%2 ==0) return a+b; else return a;});
        sumEventValue.ifPresent(integer -> out.println("Sum of event value: " + integer));

        oddValue = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n>15);
        out.print("Odd value more than 15: ");
        oddValue.forEach(n -> out.print(n + " "));
        out.println();

        oddValue = myList.stream().filter((n) -> (n % 2) != 1).filter((n) -> n>15);
        out.print("Even value more than 15: ");
        oddValue.forEach(n -> out.print(n + " "));
        out.println();
    }
}