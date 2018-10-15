import java.util.Scanner;

class reverse_part_string {
    public static void main (String [] str) {
        String a;
        Scanner sc = new Scanner(System.in);
        for(;;) {
            StringBuilder reverse= new StringBuilder();
            StringBuilder reverse2= new StringBuilder();
            StringBuilder reverse3= new StringBuilder();
            a = sc.nextLine();
            int q = a.length();
            for (int i = q - 1; i >= 0; i--)
                reverse.append(a.charAt(i));

                String p = a.substring(0, a.length() / 2);
                String o = a.substring((a.length() / 2));

                int x = p.length();
            for (int i = x - 1; i >= 0; i--){
                reverse2.append(p.charAt(i));}

            int c = o.length();
            for (int i = c - 1; i >= 0; i--){
                reverse3.append(o.charAt(i));}

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

