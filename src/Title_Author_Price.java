import java.util.Scanner;

abstract class Book {
    private String title;
    private String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}
class MyBook extends Book{
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
        Book book = new MyBook(title, author, price);
        book.display();
    }
}