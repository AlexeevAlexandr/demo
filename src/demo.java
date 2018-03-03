import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(a+"\n"+b+"\n"+c);
        System.out.println("sum = "+(a+b+c));
    }
}

