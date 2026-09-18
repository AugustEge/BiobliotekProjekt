import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        ConsoleUI consoleUI = new ConsoleUI(library);

        Book book1 = new Book("J.K Rowling", "Harry Potter og De Vises Sten", "978074753274", 1);
        Book book2 = new Book("George Orwell", "1984", "9780451524935", 2);
        Book book3 = new Book("Jane Austen", "Stolthed og fordom", "9780141439518", 3);

        Member member1 = new Member("August Egeberg", 111);
        Member member2 = new Member("Lone Horn", 222);
        Member member3 = new Member("Abi Frost", 333);

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        consoleUI.run();
    }


























//    ArrayList<Book> books = new ArrayList<>();
//    books.add(new Book("J.K Rowling", "Harry Potter og De Vises Sten", "978074753274", 1));
//    books.add(new Book("George Orwell", "1984", "9780451524935", 2));
//    books.add(new Book("Jane Austen", "Stolthed og fordom", "9780141439518", 3));
//
//    Book harryPotter = new Book("J.K Rowling", "Harry Potter og De Vises Sten", "978074753274", 1);
//
//    boolean isFound2 = books.contains(harryPotter);
//    IO.println(isFound2);


    }

