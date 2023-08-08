 
 
 // Before applying LISkOV SUBSTITUTION PRINCIPLE (subclasses should be substitutable for their base classes.)



 //Let's  we have books in the school management system for different purposes
// But we may need the Dynamic method dispatch (Runtime polymorphisom) in the project 
//Which means we may use the referece of superclass but using the object of the subclass
//which also means that whenever we need the super class object  we could replace the super class object with the subclass object

//But in this example,Abstract class book is extended by Textbook , and fictional book, but they implement their own displayInformation() method
// but the class book had that method
// by this subclass Textbook,and Fictional book are no longer adhere to the contract defined by the base class Book.
// Substituting a Textbook or FictionBook instance for a Book instance in the Library class may lead to unexpected behavior
// or incorrect output, as the displayInformation() method behaves differently for each subtype.
// this is the violation of LSP in this code




public abstract class Book {
    private String title;
    private String author;

    public void displayInformation() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor()); // here is the violation of LSP
    }
}

public class Textbook extends Book {
    private String subject;

    // Constructor, getters, and setters omitted for brevity

    @Override
    public void displayInformation() {
        System.out.println("Textbook: " + getTitle() + " by " + getAuthor() + ", Subject: " + subject);
    }
}

public class FictionBook extends Book {
    private String genre;

    // Constructor, getters, and setters omitted for brevity

    @Override
    public void displayInformation() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + ", Genre: " + genre);
    }
}

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBookInformation() {
        for (Book book : books) {
            book.displayInformation();
        }
    }
}



// Now After applying LISCOV SUBSTITUTION PRINCIPLE (subclasses should be substitutable for their base classes.)
//Solution to this type of problem

// we can make displayInformation() method abstract so that evrery time a subclass extends this class ,can implement their own 
// also super class remains replaceable with the subclass object
// beacuse the subclasss inherits all the property defined in the superclass

public abstract class Book {
    private String title;
    private String author;

    // Constructor, getters, and setters omitted for brevity

    public abstract void displayInformation();
}

public class Textbook extends Book {
    private String subject;

    // Constructor, getters, and setters omitted for brevity

    @Override
    public void displayInformation() {
        System.out.println("Textbook: " + getTitle() + " by " + getAuthor() + ", Subject: " + subject);
    }
}

public class FictionBook extends Book {
    private String genre;

    // Constructor, getters, and setters omitted for brevity

    @Override
    public void displayInformation() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + ", Genre: " + genre);
    }
}

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBookInformation() {
        for (Book book : books) {
            book.displayInformation();
        }
    }
}
