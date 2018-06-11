public class recursion {
    public static void main(String[] args) {
        function(1);
    }
    private static void function(int n){
        System.out.println(n);
        if(n<7){
            function(2*n);
        }
        System.out.println(n);
    }
}
