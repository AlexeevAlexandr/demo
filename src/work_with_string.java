import static java.lang.System.out;

class work_with_string {
    public static void main(String args[]) {
        String s = " Java - is programming language and it is very good language. ";
        out.println(s);

        //output some info about index of char
        out.println("indexOf(a) = " + s.indexOf('a'));
        out.println("lastIindexOf(a) = " + s.lastIndexOf('a'));
        out.println("indexOf(is) = " + s.indexOf("is"));
        out.println("lastlndexOf(is) = " + s.lastIndexOf("is"));
        out.println("indexOf(g, 10) = " + s.indexOf('g', 10));
        out.println("lastIndexOf(g, 60) = " + s.lastIndexOf('g', 60));
        out.println("indexOf(-, 10) = " + s.indexOf("-", 10));
        out.println("lastIndexOf(., 60) = " + s.lastIndexOf(".", 60));

        String q=s.replace('a','o');//replace char a to o
        out.println(q);

        String w = s.trim();//delete space from string at start and at end
        out.println(w);

        String e = w.toUpperCase();
        out.println(e);

        String r = w.toLowerCase();
        out.println(r);

        StringBuffer d = new StringBuffer(w);//add "very" in string
        d.insert(40, " very");
        out.println(d);

        StringBuffer t = new StringBuffer(w);//reverse string
        t.reverse();
        out.println(t);

        StringBuffer y = new StringBuffer(w);//delete part string from 4 till 6 index
        y.delete(4,6);
        out.println(y);

        StringBuffer u = new StringBuffer(w);//delete specified char
        u.deleteCharAt(0);
        out.println(u);

        StringBuffer i = new StringBuffer(w);//replace part of string
        i.replace(0,4,"JAVA");
        out.println(i);

        StringBuffer o = new StringBuffer(i);
        String z = o.substring(0,4);//output part of string from 0 till 4 index
        String x = o.substring(4);//output part of string from 0 index till end
        out.println(z);
        out.println(x);
    }
}