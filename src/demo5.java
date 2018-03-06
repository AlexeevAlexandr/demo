import java.util.*;

public class demo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        for (; ; ) {
            i += 1;
            String n = sc.nextLine();
            if(n.equals("q")){
                System.out.println("exit");
                break;
                }
                System.out.println(i + " " + n);
            }
        }

    }
