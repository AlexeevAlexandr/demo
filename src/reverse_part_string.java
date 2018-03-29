import java.util.Scanner;

class reverse_part_string {
    public static void main (String [] str) {
        String a;
        Scanner sc = new Scanner(System.in);
        for(;;) {
            String reverse="", reverse2="", reverse3="";
            a = sc.nextLine();
            int q = a.length();
            for (int i = q - 1; i >= 0; i--)
                reverse = reverse + a.charAt(i);

                String p = a.substring(0, a.length() / 2);
                String o = a.substring((a.length() / 2), a.length());

                int x = p.length();
            for (int i = x - 1; i >= 0; i--){
                reverse2 = reverse2 + p.charAt(i);}

            int c = o.length();
            for (int i = c - 1; i >= 0; i--){
                reverse3 = reverse3 + o.charAt(i);}

            if(a.equals("stop")) break;
            System.out.println("inverted  all string:\t"+reverse);
            System.out.println ("first half part string:\t" + p);
            System.out.println ("second half part string:\t" + o);
            System.out.println("inverted first half part string:\t" + reverse2);
            System.out.println("inverted second half part string:\t" + reverse3);
            System.out.println();
            }
        }
    }

