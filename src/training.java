class Gen <T> {
    private T ob;
    Gen(T o) {
        ob = o;
    }
    T getob() {
        return ob;
    }
    void showType() {
        System.out.println("type Т is "+ob.getClass().getName());
    }
}
class training {
    public static void main(String args[]) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getob ();
        System.out.println("Знaчeниe: " + v);
        System.out.println();
        Gen<String> strOb = new Gen<>("Тест обобщений");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("Знaчeниe: " + str);
    }
}