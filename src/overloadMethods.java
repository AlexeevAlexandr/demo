public class overloadMethods {
    void test() {
        System.out.println("no parameters");
    }
    void test(int a) {
        System.out.println("a: "+a);
    }
    void test(int a, int b) {
        System.out.println("a and b: "+a+" "+b);
    }
    double test(double a) {
        System.out.println("double а: "+a);
        return a+a;
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
