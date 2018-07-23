import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
class Annotation {
@ MyAnno (str = "annotation" , val=19 )
private static void myMath(String str, int i) {
    Annotation ob = new Annotation();
    try {
        Class <?> c = ob.getClass();
        Method m = c.getMethod("myMath", String.class, int.class);
        MyAnno anno = m.getAnnotation(MyAnno.class);
        System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException exc) {
        System.out.println("Meтoд не найден.");
    }
}
            public static void main (String args [] ){
                myMath("Matrix.TestAccountManager", 10);
            }
        }