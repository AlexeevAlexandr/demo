public class recursion {
    public static void main(String[] args) {
        f(1);
    }
    private static void f(int n){
        System.out.println(n);
        if(n<7){
            f(2*n);
        }
        System.out.println(n);
    }
}
