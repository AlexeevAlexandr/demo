public class toString_part_printOneCharEach{
    private static String toString(String ch){
        return ch;
    }
    public static void main(String [] args) {
        String  a = "demo";

        System.out.println(toString(a));   //simple toString

        for(int i=0; i<a.length();i++)     //print string one char each
        {
            char q = a.charAt(i);
            System.out.println(q);
        }

        System.out.println();

        int start = 1, end =3;              //print part of string
        char s [] = new char [end - start];
        a.getChars(start, end, s, 0);
        System.out.println(s);

    }


}

