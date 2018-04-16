import java.util.Arrays;
import static java.lang.Math.*;
//if sqrt number is integer - return him sqrt, else - return (number * number)
public class sqrt_number {
    public static void main(String args[]) {
        int array[] = new int[]{4,3,9,7,2,1};
        int [] q = new int[array.length];
        int w;
        for(int i=0; i<array.length; i++){
            w=(int)floor((sqrt(array[i])));
            if((sqrt(array[i]))-w==0){q[i]=(int)sqrt(array[i]);}
            else{q[i]=(array[i]*array[i]);}
        }
        System.out.print(Arrays.toString(q));
    }
}



