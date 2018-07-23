package API;

import java.util.regex.*;

public class API_replace_all_matches {
    public static void main(String args[]) {
        Pattern pat;
        Matcher mat;
        String str = "Jon Jonathan Tim Jon ";
        pat = Pattern.compile("Jon ");//replace all matches
        mat = pat.matcher(str);
        while(mat.find()){
            str = mat.replaceAll("Tom ");//can will be replaceFirst()
        }
        System.out.println(str);


        StringBuffer st = new StringBuffer();//change symbol
        pat = Pattern.compile("o");
        mat = pat.matcher(str);
        while(mat.find()){
            mat.appendReplacement(st,"a");
        }
        mat.appendTail(st);
        System.out.println(st.toString());
    }
}