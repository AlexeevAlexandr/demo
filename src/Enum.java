import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

enum Enum1 {
    de(6), fr(5), tg(4), yh(3), ol(2), pp(1);
    private int price;
    Enum1(int p){price = p;}
    int getPrice(){return price;}
}

class Enum2{
    private int p,o;
    Enum2(int y, int z) {
        p=y;
        o=z;
        }
    int sum(){return p + o;}
}

class Enum{
    public static void main (String args[]) {
        Enum1 q = Enum1.de;
        out.println(q);
        out.println(Enum1.fr);
        out.println("\nall list:");

        for (Enum1 a : Enum1.values())  //return all list Enum1
            out.println(a);


        out.println();

        out.println("one object: "+Enum1.de.getPrice());
        out.println();
        for(Enum1 a : Enum1.values())   //return all list Enum1 with (digits)
        out.println("all objects: "+a+" "+a.getPrice());

        for(Enum1 a : Enum1.values())  //return number of position in list Enum1
            out.println(a+" "+(a.ordinal()+1));

        Scanner sc = new Scanner(in);
        out.println("enter two integers: ");
        int e = sc.nextInt(), w = sc.nextInt();
        Enum2 a = new Enum2(e, w);
        int vol = a.sum();
        out.println("sum = " + vol);
    }
}