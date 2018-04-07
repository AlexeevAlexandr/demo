import java.net.*;
import java.io.*;
import java.util.Date;

class ClassUrlConnectionDemo {
    public static void main(String args[]) throws Exception {
        int c;
        URL hp = new URL("https://github.com/AlexeevAlexandr/commit-from-IJ");
        URLConnection hpCon = hp.openConnection();
        long d = hpCon.getDate();
        if (d == 0) {
            System.out.println("Cвeдeния о дате отсутствуют.");
        } else {
            System.out.println("Дaтa: " + new Date(d));
        }
        System.out.println("Тип содержимого: " + hpCon.getContentType());
        d = hpCon.getExpiration();
        if (d == 0) {
            System.out.println("Сведения о сроке действия отсутствуют.");
        } else {
            System.out.println("Срок действия истекает: " + new Date(d));
        }
        d = hpCon.getLastModified();
        if (d == 0) {
            System.out.println("Сведения о дате последней модификации.");
        } else {
            System.out.println("Дата последней модификации: " + new Date(d));
        }
        long len = hpCon.getContentLengthLong();
        if (len == -1) {
            System.out.println("Длинa содержимого недоступна.");
        } else {
            System.out.println("Длинa содержимого: " + len);
        }
        if (len != 0) {
            System.out.println("===Содержимое===");
        InputStream input = hpCon.getInputStream();
        while (((c = input.read()) != -1)) {
            System.out.print((char) c);
        }
            input.close();
        }else{
            System.out.println("Coдepжимoe недосmуnно.");
        }
    }
}