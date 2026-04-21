package prototype;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Recommendation> recommendations = new ArrayList<>();

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
        System.out.println("---Pre-created test recommendations---");
        System.out.println("Original:");
        System.out.println(rec1);

        System.out.println("\nClone:");
        System.out.println(rec2);
        System.out.println();

        recommendations.add(rec1);
        recommendations.add(rec2);


        // User interface
        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewRecommendations();
                    break;
                case "2":
                    createRecommendation();
                    break;
                case "3":
                    cloneRecommendation();
                    break;
                case "4":
                    modifyRecommendation();
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n=== Recommendation Manager ===");
        System.out.println("1. View all recommendations");
        System.out.println("2. Create a new recommendation");
        System.out.println("3. Clone an existing recommendation");
        System.out.println("4. Modify a recommendation");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private static void viewRecommendations() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available.");
            return;
        }

        for (int i = 0; i < recommendations.size(); i++) {
            System.out.println("[" + i + "] " + recommendations.get(i));
        }
    }

    private static void createRecommendation() {
        System.out.print("Enter target audience: ");
        String audience = scanner.nextLine();

        Recommendation rec = new Recommendation(audience);

        while (true) {
            System.out.print("Add a book? (y/n): ");
            String ans = scanner.nextLine();

            if (ans.equalsIgnoreCase("n")) break;

            rec.addBook(createBook());
        }

        recommendations.add(rec);
        System.out.println("Recommendation created.");
    }

    private static Book createBook() {
        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Publication year: ");
        int year = Integer.parseInt(scanner.nextLine());

        return new Book(author, title, year);
    }

    private static void cloneRecommendation() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations to clone.");
            return;
        }

        viewRecommendations();
        System.out.print("Enter index of recommendation to clone: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Recommendation cloned = recommendations.get(index).clone();
        recommendations.add(cloned);

        System.out.println("Cloned recommendation added as new entry.");
    }

    private static void modifyRecommendation() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations to modify.");
            return;
        }

        viewRecommendations();
        System.out.print("Enter index of recommendation to modify: ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Recommendation rec = recommendations.get(index);

        System.out.println("Modify:");
        System.out.println("1. Change target audience");
        System.out.println("2. Add a book");
        System.out.print("Choose: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.print("New target audience: ");
                rec.setTargetAudience(scanner.nextLine());
                System.out.println("Audience updated.");
                break;

            case "2":
                rec.addBook(createBook());
                System.out.println("Book added.");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
