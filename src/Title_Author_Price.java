import java.util.Scanner;

abstract class Books {
    Books(String title, String author) {
    }
    abstract void display();
}
class MyBook extends Books{
    MyBook(String title, String author, int price) {
        super(title, author);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    @Override
    void display() {
    }
}
public class Title_Author_Price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();
        Books book = new MyBook(title, author, price);
        book.display();
    }
}