import java.util.Scanner;
import java.util.function.Function;
class function_interface {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            Function<Integer, Integer> factorial = (n) ->
            {
                int result = 1;
                for (int i = 1; i <= n; i++)
                    result = i * result;
                return result;
            };
            System.out.println("factorial = " + factorial.apply(q));
            }catch (Exception e) {System.out.println("You enter incorrect number "+e);
        }
    }
}