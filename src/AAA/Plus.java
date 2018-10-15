package AAA;

class Plus implements A,Runnable{
    Thread thread;

    private Plus(){}

    Plus(String name){
        thread = new Thread(this,name);
        thread.start();
        thread.setPriority(10);
    }

    @Override
    public void method(int a, int b) {
        System.out.println(a + b);
    }

    @Override
    public void run() {
       A a = new Plus();
       a.method(2,2);
    }
}
