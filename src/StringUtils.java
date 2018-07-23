import static java.lang.Math.abs;
public class StringUtils {
    public static String rightShift(String arg, int delta) {
        final int check = delta;
        if (arg.length() == 0 || delta == 0){return arg;}
        else {
            delta %= arg.length();
            if (check < 0) {
                delta = abs(delta);
                arg = String.valueOf(new StringBuilder(arg).reverse());}

                for (int i = 0; i < delta; i++) {
                    arg = arg.charAt(arg.length() - 1) + arg.substring(0, arg.length() - 1);
                }

            if (check < 0)arg = String.valueOf(new StringBuilder(arg).reverse());
            }
        System.out.println(arg);
        return arg;
    }
}
 class Testf {
    public static void main(String[] args) {
        String actual = StringUtils.rightShift("abc", 1);
        String expected = "cab";

        if (!actual.equals(expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}

