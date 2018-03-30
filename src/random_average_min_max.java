import java.util.*;

public class random_average_min_max{
    public static void main(String args[]){
        Random random = new Random();
        int val, sum = 0;
        int[] numbers= new int [10];
        for (int i = 0; i < 10; i++){
            val = random.nextInt(100);//return random number from '0' till '100'
            sum += val;
            numbers [i] = val;
            for (int x = 0; x < val; x++){
                System.out.print("*");
            }
            System.out.print(val+"\n");
        }
        Arrays.sort(numbers);//sort array of numbers

        System.out.println("Average value: "+(sum/10));
        System.out.println("Min value: "+(numbers[0]));
        System.out.println("Max value: "+(numbers[numbers.length-1]));
    }
}