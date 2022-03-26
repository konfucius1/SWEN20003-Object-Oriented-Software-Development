public class Book {
    public String author;
    public String title;
    public boolean borrowed;
    public String borrowedBy;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean borrowed() {
        return borrowed;
    }

    // mutate method
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void borrow(String borrowedBy) {
        this.borrowedBy = borrowedBy;
        if (borrowedBy == null) {
            borrowed = false;
        } 
        borrowed = true;
    }

    public String toString() {
        return "Details of books: " + title + ", " + author + " book is borrowed by " + borrowedBy;
    }
}
