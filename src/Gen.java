import java.util.Scanner;

class Gen <T, V> {
    private T ob;
    private V ob2;

    Gen(T o, V o2) {
        ob = o;
        ob2 = o2;
    }
    T getob() {
        return ob;
    }
    V getob2(){
        return ob2;
    }
    void showType () {
        System.out.println("Type Т is: " + ob.getClass().getName());
        System.out.println("Type V is: " + ob2.getClass().getName());
    }
    static void scanner(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(a);
    }
}
class generality {
    public static void main(String args[]) {

        Gen<Integer, String> iOb = new Gen<>(88, "Matrix.Test" );
        Gen<String, Integer> iOb2 = new Gen<>("Test2", 99 );

        iOb.showType();
        System.out.println("Value T: "+iOb.getob());
        System.out.println("Value V: "+iOb.getob2());

        iOb2.showType();
        System.out.println("Value T: "+iOb2.getob());
        System.out.println("Value V: "+iOb2.getob2());

        Gen.scanner();
    }
}