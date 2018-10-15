package AAA;

class Minus implements A,Runnable {

    Thread thread;

    private Minus(){}

    Minus(String name){
        thread = new Thread(this,name);
        thread.start();
    }
    @Override
    public void method(int a, int b) {
        System.out.println(a - b);
    }

    @Override
    public void run() {
        A a = new Minus();
        a.method(2,2);
    }
}
