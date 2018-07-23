package API;

import java.util.regex.*;

class API_Pattern_Matcher {
    public static void main(String args[]) {
        int count = 0;
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");//sequence for searching in input sequence

        //search accurate match
        mat = pat.matcher("Java");//input sequence
        found = mat.matches();
        System.out.print("Java and Java - ");
        System.out.println(found ? "match" : "not match");


        //search accurate match
        System.out.print("Java and Java demo - ");
        mat = pat.matcher("Java demo");
        found = mat.matches();
        System.out.println(found ? "match" : "not match");

        //search sequence in string, counting quantities coincidences, output indexes of start matches
        System.out.print("Search sequence Java in string: Java demo Javac and cJava - ");
        mat = pat.matcher("Java demo Javac and cJava");
        if (mat.find()){
            System.out.print("find sequence, indexes of start matches: ");
            do{
                count += 1;
                System.out.print(mat.start()+", ");
            }while (mat.find());
            System.out.print(" find "+count+" time");
        }else System.out.println("not find sequence");
    }
}