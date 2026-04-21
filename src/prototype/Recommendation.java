package prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable{
    private String targetAudience;
    private List<Book> books;

    public Recommendation (String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            // deep clone
            for (Book book : this.books) {
                clonedRecommendation.addBook(book.clone());
            }
            return clonedRecommendation;

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
