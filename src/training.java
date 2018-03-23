class Gen2 <T> {
    private T ob;
    Gen2(T o) {
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
        Gen2<Integer> iOb;
        iOb = new Gen2<>(88);
        iOb.showType();
        int v = iOb.getob ();
        System.out.println("Знaчeниe: " + v);
        System.out.println();
        Gen2<String> strOb = new Gen2<>("Тест обобщений");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("Знaчeниe: " + str);
    }
}