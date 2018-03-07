import java.util.Scanner;

class demo6 {
    public static void main (String [] str) {
        String a;
        Scanner sc = new Scanner(System.in);
        for(;;) {
            String reverse="";
            a = sc.nextLine();
            int q = a.length();
            for (int i = q - 1; i >= 0; i--)
                reverse = reverse + a.charAt(i);
            if(a.equals("stop")) break;
            System.out.println(reverse);
        }
    }

}