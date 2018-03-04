import java.util.Scanner;

public class demo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

           int i = scan.nextInt();
           double d = scan.nextDouble();
           String s = scan.nextLine();
            String q = scan.nextLine();


        System.out.println("String: "+ s+q);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}