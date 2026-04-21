package prototype;

public class Book implements Cloneable{
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override
    public Book clone() {
        try {
            Book clonedBook = (Book) super.clone();
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
