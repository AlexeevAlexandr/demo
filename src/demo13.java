public class demo13 {
        private double width;
        private double height;
        private double depth;

            demo13(double w, double h, double d){
                width=w;
                height=h;
                depth=d;
            }
            double volume(){
            return width*height*depth;
            }
        }
    class d{
        public static void main (String args[]){
            demo13 demo1 = new demo13(10,20,15);
            demo13 demo2 = new demo13(3,6,9);
            double vol;

            vol = demo1.volume();
            System.out.println(vol);

            vol = demo2.volume();
            System.out.println(vol);
        }
    }

