import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

public class TestUser {
    static final Map<String, Character> QUESTIONS = new HashMap<String, Character>() {
        {
            put("Thread is a process", 'N');
            put("List cannot contain duplicates", 'N');
            put("Set can contain duplicates", 'N');
            put("Java is platform independent", 'Y');
            put("Java supports copy constructors like C++", 'Y');
            put("The primitive data types supported by the Java programming language are: byte, short, int, long, float, double, boolean, char", 'Y');
            put("Constructor overloading is similar to method overloading in Java", 'N');
            put("The purpose of garbage collection in Java is to reclaim and reuse objects which are no longer used", 'Y');
            put("Autoboxing is the automatic conversion made by the Java compiler between the primitive types and their corresponding object wrapper classes", 'Y');
            put("JDBC is an abstraction layer that allows users to choose between databases", 'Y');
            put("Java supports the usage of pointers", 'N');
        }
    };
    static class Main2 {
        static char q, w;
        static final String string1 = "You are a junior Java developer";
        static final String string2 = "You are a medium Java developer";
        static final String string3 = "You are a senior Java developer";
        static String a;
        static int count;

        Main2(int count2) {
            if (count2 >= 0 && count2 <= 3) {Main2.a = TestUser.Main2.string1;}
            if (count2 > 3 && count2 <= 7) {Main2.a = TestUser.Main2.string2;}
            if (count2 > 7 && count2 <= 11) {Main2.a = TestUser.Main2.string3;}
        }
    }
    static class Main3 {
        static Scanner sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Singleton.getInstance();

    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){
        for (Map.Entry<String, Character> me : TestUser.QUESTIONS.entrySet()) {
            out.println(me.getKey());
            out.print("Y or N\t");
            TestUser.Main2.q = TestUser.Main3.sc.next().charAt(0);
            TestUser.Main2.w = Character.toUpperCase(TestUser.Main2.q);
            if (TestUser.Main2.w == (me.getValue())) {
                TestUser.Main2.count++;
            }
        }
        new TestUser.Main2(TestUser.Main2.count);
        out.println(TestUser.Main2.a);
    }
    public static void getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
    }
}