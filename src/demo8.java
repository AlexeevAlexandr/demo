public class demo8{
    private static String toString(String ch){
        return ch;
    }
    public static void main(String [] args) {
        String  a = "demo";

        //simple toString
        System.out.println(toString(a));

        //print string one char each
        for(int i=0; i<a.length();i++)
        {
            char q = a.charAt(i);
            System.out.println(q);
        }

        System.out.println();

        //print part of string
        int start = 1, end =3;
        char s [] = new char [end - start];
        a.getChars(start, end, s, 0);
        System.out.println(s);

    }


}

