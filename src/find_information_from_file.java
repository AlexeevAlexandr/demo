import java.io.*;
import java.util.*;

public class find_information_from_file {
    public static void main(String args[]) throws IOException {
        String name, exit;
        System.out.println("welcome to the phone book");
        do {
            System.out.println("Enter the name which you are looking for (or OOP for exit)");
            Properties ht = new Properties();
            FileInputStream list = null;
            try {
                list = new FileInputStream("phone book.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

            try {
                if (!list.equals(null)) {
                    ht.load(list);
                    list.close();
                }
            } catch (IOException ee) {
                System.out.println("Error riding file");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            name = br.readLine();
            if (name.equals("OOP")){break;}
            String information = (String) ht.get(name);
            if (information != null) {
                System.out.println(name + ": " + information);
            } else {
                System.out.println("Name not found");
            }
            System.out.println("Do you want continue y/n?");
            exit = br.readLine();
            if (!exit.equals("y")){System.out.println("bye");break;}
        }while(!name.equals("OOP") && exit.equals("y"));
    }
}