import java.util.Arrays;

public class print_reverse_number {
    public static void main (String args[]){
        int q= 125984;
        String qq = String.valueOf(q);
        char [] z = new char [qq.length()];
        for(int i=0; i<qq.length(); i++){
            z[i] = qq.charAt(i);
        }
        Arrays.sort(z);
        StringBuffer t = new StringBuffer(String.valueOf(z));
        t.reverse();
        int qqq = Integer.parseInt(String.valueOf(t));
        System.out.print(qqq);
    }
}
//convert int to string, sort, revers and convert to int (print 985421)