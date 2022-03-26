public class bookTest {
    public static void main(String args[]) {
        Book bookA = new Book("Twilight", "J.K Rowling");

        bookA.borrow("Thanakon");
        System.out.println("Book is borrowed by " + bookA.borrowedBy);
        System.out.println(bookA.borrowed);
        System.out.println(bookA.toString());
    }
}
