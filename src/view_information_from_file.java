import java.io.*;
import java.util.*;

class view_information_from_file{
    public static void main (String args []){
        Properties ht = new Properties();
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("resources/phone book.txt");
        }catch (FileNotFoundException e){System.out.println("File not found");}
        try{
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        }catch (IOException ee){System.out.println("Error riding file");}
        System.out.println("List of names:");
        String qq = String.valueOf(ht)
                .replaceFirst("}", "")
                .replaceFirst("\\{", "")
                .replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(qq, "=,");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key+"\t"+val);
        }
    }
}


