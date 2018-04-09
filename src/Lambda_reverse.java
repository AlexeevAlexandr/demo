import java.util.Scanner;

interface StringFunc {
    String func(String n);
}
class Lambda_reverse {
    public static void main(String args[]) {
        System.out.print("Enter string\t");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--)
                result.append(str.charAt(i));
            return result.toString();
        };
        System.out.println("String reverse " + reverse.func(string));
    }
}