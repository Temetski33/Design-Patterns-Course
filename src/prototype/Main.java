package prototype;

public class Main {
    public static void main(String[] args) {
        // Original recommendation
        Recommendation rec1 = new Recommendation("Teens");
        rec1.addBook(new Book("Brandon Sanderson", "Mistborn: The Final Empire", 2006));
        rec1.addBook(new Book("J.R.R. Tolkien", "The Hobbit", 1937));

        // Clone it
        Recommendation rec2 = rec1.clone();

        // Modify the clone
        rec2.setTargetAudience("Adults");
        rec2.addBook(new Book("George Orwell", "1984", 1949));

        // Print both
        System.out.println("Original:");
        System.out.println(rec1);

        System.out.println("\nClone:");
        System.out.println(rec2);
    }
}
