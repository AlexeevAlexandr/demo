import java.util.Scanner;

interface lambda2<T>{
   T func(T t);
}
public class generalized_interface {
    public static void main(String args[]) {
        System.out.print("Enter the number: \t");
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        lambda2<Integer> factorial = (t) ->
        {
            int result = 1;
            for (int i = 1; i <= t; i++)
                result = i * result;
            return result;
        };
        System.out.println("Factorial number "+q+" is: \t" + factorial.func(q));

        System.out.println();

        System.out.print("Enter string: \t");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        lambda2<String> reverse = (t) ->
        {
            StringBuilder result = new StringBuilder();
            for (int i = t.length() - 1; i >= 0; i--)
                result.append(t.charAt(i));
            return result.toString();
        };
        System.out.println("String reverse: " + reverse.func(string));
        }
    }

