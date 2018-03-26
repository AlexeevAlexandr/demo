import java.util.Scanner;

//counting of volume
public class inheritance {
    private double width;
    private double height;
    private double depth;

    inheritance(double w, double h, double d){
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
            inheritance demo1 = new inheritance(s.nextDouble(), s.nextDouble(), s.nextDouble());
            double vol;
            vol = demo1.volume();
            System.out.println("Volume: "+vol);
        } catch (Exception e) {
            System.out.println("you enter incorrect information, try again");
            }
        }
    }

