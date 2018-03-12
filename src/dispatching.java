class dispatching {
    void callme() {
        System.out.println("B методе callme() из класса dispatching");
    }
}
class B extends dispatching {
    void callme() {
        System.out.println("B методе callme() из класса В ");
    }
}
class C extends dispatching {
    void callme() {
        System.out.println("B методе callme() из класса С");
    }
}
class Dispatch{
    public static void main(String args []) {
        dispatching a = new dispatching();
        B b = new B();
        C c = new C();

        dispatching r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
