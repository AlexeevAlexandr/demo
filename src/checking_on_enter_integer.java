import java.util.Scanner;

public class checking_on_enter_integer {   //checking on enter integer

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            Integer.parseInt(S);
            {System.out.println(S);}
        }catch(NumberFormatException e){System.out.println("Bad String "+e);}

    }
}
