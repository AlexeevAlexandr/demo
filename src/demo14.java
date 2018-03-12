import java.util.Scanner;

public class demo14 {
    private double width;
    private double height;
    private double depth;

    demo14(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
class dd{
    public static void main (String args[]) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter: width, height and depth");
            demo14 demo1 = new demo14(s.nextDouble(), s.nextDouble(), s.nextDouble());
            double vol;
            vol = demo1.volume();
            System.out.println(vol);
        } catch (Exception e) {
            System.out.println("you enter incorrect information, try again");
            }
        }
    }

