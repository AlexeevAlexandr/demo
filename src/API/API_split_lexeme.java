package API;

import java.util.regex.Pattern;

public class API_split_lexeme {
    public static void main(String args[]) {
        String q = "one two,alpha9 12!done.";
        Pattern pat = Pattern.compile("[ ,.!]");//lexemes for dividing string (can will be any symbol)
        String [] str = pat.split(q);
        System.out.println("Found "+str.length+" parts of string");
        for (int i=0; i<str.length; i++){
            System.out.println("Part #"+(i+1)+" - "+str[i]);
        }
    }
}
