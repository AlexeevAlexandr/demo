package OOP.Sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

class Tests {

    private Main main = new Main();
    private Object [] string1 = {"B", "C", "method"};
    private Object [] string2 = {"method", "B", "C"};
    private Object [] string3 = main.test(string1);

    public void testLaunch() {
        setUp();
        main();
        tearDown();
    }

    @Before
    public void setUp(){ System.out.println("Tests start");}

    @After
    public void tearDown(){System.out.println("Tests finish");}

    @Test
    public void main() {
        System.out.println((Arrays.equals(string2, string3)) ? "Test1 OK" : "Test1 failed");
    }
}
public class LaunchTest{
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testLaunch();
    }
}