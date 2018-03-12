import java.util.Scanner;

public class factorial_recursion_method {
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
class Recursion {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            factorial_recursion_method f = new factorial_recursion_method();
            System.out.println("Factorial = " + f.fact(q));
            } catch (Exception e){System.out.print("You enter incorrect integer");}
        }
    }

