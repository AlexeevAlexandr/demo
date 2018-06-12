import java.io.*;
import java.util.*;

public class writing_info_in_file {
    public static void main(String args[]) throws IOException{
        Boolean changed = false;
        String name,number;
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("phone book.txt");
        } catch (FileNotFoundException e) { System.out.println("File not found");}

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (Exception e){System.out.println("Error riding file");}

        do {
            System.out.println("Enter name or 'OOP' for exit");
            name = br.readLine();
            if (name.equals("OOP")) continue;
            System.out.println ("Enter number:");
            number = br.readLine();
            ht.put (name, number);
            changed = true ;
        }while (!name.equals("OOP"));
        if(changed){
        FileOutputStream file = new FileOutputStream ("phone book.txt");
        ht.store (file, "Phone book");
        file.close();
        }
    }
}
