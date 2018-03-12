import static java.lang.StrictMath.abs;

public class overloadMethods {
    void test() {
        System.out.println("no parameters");
    }
    void test(int а) {
        System.out.println("a: "+а);
    }
    void test(int а, int b) {
        System.out.println("a and b: "+а+" "+b);
    }
    double test(double а) {
        System.out.println("double а: "+а);
        return а+а;
    }
    void test(String a){
        System.out.println("String: "+a);
    }
}
class Overload {
    public static void main(String args[]) {
        overloadMethods ob = new overloadMethods();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        ob.test("string");
        result = ob.test(-15.05);
        System.out.println("result "+result);
        System.out.println("abs "+Math.abs(result));
    }
}
