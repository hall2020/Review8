package class15;

public class Book {
    private String name;
    private String subject;
    private int page;
    private double price;
    private String genre;


    public Book(String name, String subject, int page, double price) {
        this.name = name;
        this.subject = subject;
        this.page = page;
        this.price = price;

    }

    public Book(String name, String subject, int page, double price, String genre) {
        this(name, subject, page, price);
        this.genre=genre;
    }

    public void printInfo() {
        System.out.println(name + " " + subject + " " + page + " " + price);

    }
    public void printAllInfo() {
        System.out.println(name + " " + subject + " " + page + " " + price + " " + genre);

    }



    public static void main(String[] args) {
        Book b=new Book("Martin Eden", "Life of Martin", 330, 22.50, "Adventure" );
        b.printInfo();
        Book b2=new Book("War", "Life in war", 120, 53.45);
        b2.printInfo();
    }

}
