public class string_print_by_char {
    public static void main (String args[]){//return D-Ee-Mmm-Oooo
        String q = "demO";
        StringBuilder str = new StringBuilder();
        for (int i=0; i < q.length(); i++){
            for(int ii=0; ii < i+1; ii++) {
                String w = String.valueOf(q.charAt(i));
                if (ii == 0) {
                    String s = w.toUpperCase();
                    str.append(s);
                } else {
                    str.append(w.toLowerCase());
                }
            }
            if(i==(q.length()-1)) {continue;}
            str.append("-");
        }
        System.out.print(str.toString());
    }
}
