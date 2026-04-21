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
}
