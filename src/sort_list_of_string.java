import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

public class sort_list_of_string {
    public static void main(String args[]) {
        String str = "";
        do {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                Scanner sc = new Scanner(System.in);
                ArrayList<String> list = new ArrayList<>();
                out.println("Enter number how many words you want sorted\nif you want exit enter 0");
                int q = sc.nextInt();
                if(q == 0){break;}
                for (int i = 1; i < q+1; i++) {
                    try {
                        out.println("Enter your "+i+" word");
                        str = br.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    list.add(str);
                }
                out.println("your sorted list:");
                Collections.sort(list);
                String letter = list.get(0).substring(0, 1);
                boolean read = true;
                for (String word : list) {
                    if (!word.substring(0, 1).equals(letter)) {
                        read = true;
                        letter = word.substring(0, 1);
                    }
                    if (read) {
                        out.println(word);
                    } else {
                        out.println(word);
                    }
                    read = false;
                }
            } catch (Exception e) {
                out.println("You enter incorrect number about quantity rows.\nNumber of rows must be digit and Integer\nif you want continue press y, for exit press any another button and ENTER");
                try {
                    Scanner sc = new Scanner(System.in);
                    String z = sc.nextLine();
                    if(!z.equals("y")){break;}
                }catch(Exception d){out.print("you enter incorrect answer");}
            }
        }while(!str.equals("q"));
    }
}
