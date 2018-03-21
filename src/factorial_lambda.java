import java.util.Scanner;

interface SomeFunc{
    int func(int t);
}
class factorial_lambda {
    public static void main(String args[]) {
        System.out.print("Enter the number: \t");
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        SomeFunc factorial = (n) ->
        {
            int result = 1;
            for (int i = 1; i <= n; i++)
            result = i * result;
            return result;
        };

        System.out.println("Factorial number "+q+" is: \t" + factorial.func(q));
    }
}
