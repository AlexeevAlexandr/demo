import java.util.*;
//sorting by the first digit, deleting duplicates
public class enter_and_sort_array {
    public static void main(String args []){
        int w=0;
        Scanner in = new Scanner(System.in);

        //check for the input of integers
       do {
           try {
                System.out.print("Enter size of array: ");
                in = new Scanner(System.in);
                w = in.nextInt();
                if (w < 1) {
                System.out.println("you enter incorrect size, try again");}
            }catch(Exception e){ System.out.println("you enter incorrect size, try again "+e);}
        }while(w<1);

       //insertion strings in array
        if(w==1){System.out.println("Enter " + w + " element of array: ");}
        if(w>1) {System.out.println("Enter " + w + " elements of array: ");}
        String [] s = new String[w];
        for(int i=0; i<s.length; i++){
        s [i] = in.next();}

        //deleting [] before output array
        String string = Arrays.toString(s)
        .replaceFirst("]", "")
        .replaceFirst("\\[", "");
        System.out.println(string+"\n");

        //deleting [] before output sort array
        Set<String> set = new HashSet<>(Arrays.asList(s));
        String[] result = set.toArray(new String[set.size()]);
        String string2 = Arrays.toString(result)
                .replaceFirst("]", "")
                .replaceFirst("\\[", "");
        System.out.println("Sort list: "+ string2);
    }
}