// Abstract Class (Non-Access Modifier)
abstract class LibraryItem {
    // Protected variable (Access Modifier)
    protected String title;

    // Constructor
    public LibraryItem(String title) {
        this.title = title;
    }

    // Abstract method (Non-Access Modifier)
    abstract void displayDetails();

    // Public method (Access Modifier)
    public void showTitle() {
        System.out.println("Title: " + title);
    }
}

// Class with Access Modifiers
public class ModifiersApplication extends LibraryItem {
    // Public variable
    public String author;

    // Private variable (can only be accessed inside this class)
    private int itemID;

    // Default variable (no modifier: accessible in same package)
    int publishedYear;

    // Static variable (Non-Access Modifier)
    static String libraryName = "City Library";

    // Final variable (Non-Access Modifier)
    final String category = "Books";

    // Constructor
    public ModifiersApplication(String title, String author, int itemID, int publishedYear) {
        super(title); // Call abstract class constructor
        this.author = author;
        this.itemID = itemID;
        this.publishedYear = publishedYear;
    }

    // Implement abstract method
    @Override
    void displayDetails() {
        System.out.println("Item ID        : " + itemID);
        System.out.println("Author         : " + author);
        System.out.println("Published Year : " + publishedYear);
        System.out.println("Category       : " + category);
    }

    // Private method
    private void showItemID() {
        System.out.println("Accessing private itemID: " + itemID);
    }

    // Static method
    static void showLibraryName() {
        System.out.println("Library Name (Static): " + libraryName);
    }

    // Final method (cannot be overridden)
    final void showCategory() {
        System.out.println("Category (Final): " + category);
    }

    public static void main(String[] args) {
        System.out.println("------ Library Management System ------");

        // Create an object
        ModifiersApplication book = new ModifiersApplication("Java Programming", "Madhu", 101, 2023);

        // Access public method
        book.showTitle();

        // Access protected method
        book.displayDetails();

        // Access default variable
        System.out.println("Published Year (Default): " + book.publishedYear);

        // Access private data using private method
        book.showItemID();

        // Access static method
        ModifiersApplication.showLibraryName();

        // Access final method
        book.showCategory();
    }
}
