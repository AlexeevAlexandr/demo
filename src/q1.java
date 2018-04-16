public class q1 {
    public static void main (String args[]){//find nearest square number
        int n=111;
        int a = (int)Math.pow((int)Math.sqrt(n), 2);
        int b = (int)Math.pow((int)Math.sqrt(n) + 1, 2);
        System.out.print((n - a < b -n) ? a : b);
    }
}
