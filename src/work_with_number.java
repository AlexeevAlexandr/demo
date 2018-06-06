import java.util.Arrays;
import static java.lang.Math.*;

public class work_with_number {
    public static void main (String args [] ){
        double t= pow(5, 4);//return 5 in degree 4
        double y= scalb(5, 1);//return (5*2) 2 times
        double r= sqrt(25);//return root square from 25
        double u= abs(-5);//return absolutely value (can will be int, long, double, float)
        double i= ceil(3.5);//return a round number in a bigger side
        double o= floor(3.5);//return a round number to the smaller side
        double p= floorDiv(10, 5);//return result division of integer
        double a= floorMod(10, 2);//return the smallest integer remainder of the division (can will be int, long)
        double b= max(10, 2);//return the larger of the two numbers (can will be int, long, double, float)
        double c= min(10, 2);//return the smaller of the two numbers (can will be int, long, double, float)
        double d= rint(1.4);//return rounds the number(type double)
        float f= round(1.6);//return rounds the number(type float, long)
        int g= (int) (random()*100);//return random the number (from 0 till 100)
        double q[]={3.5, 2,5,4,1};
        Arrays.sort(q);     //sort array of numbers
        int z=Integer.parseInt(Integer.toBinaryString(123));//int to binary
        System.out.println(z);
        System.out.println(Arrays.toString(q));
        System.out.println(t+"\n"+y+"\n"+r+"\n"+u+"\n"+i+"\n"+o+"\n"+p+"\n"+a+"\n"+b+"\n"+c+"\n"+d+"\n"+f+"\n"+g);
    }
}
