public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        ConsoleUI consoleUI = new ConsoleUI(library);

        // Opret bøger
        Book book1 = new Book("J.K Rowling", "Harry Potter og De Vises Sten", "978074753274", 1, 322);
        Book book2 = new Book("George Orwell", "1984", "9780451524935", 2, 157);
        Book book3 = new Book("Jane Austen", "Stolthed og fordom", "9780141439518", 3, 723);

        // Opret film
        Movie movie = new Movie("123456", "Inception", "Warner Bros");

        // Opret videospil
        VideoGame game = new VideoGame("234567", "Minecraft", "Mojang");

        // Opret lydbøger
        AudioBook audioBook = new AudioBook("345678", "Harry Potter", "J.K. Rowling");

        // Opret medlemmer
        Member member1 = new Member("August Egeberg", 111);
        Member member2 = new Member("Lone Horn", 222);
        Member member3 = new Member("Abi Frost", 333);

        // Tilføj medlemmer
        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        // Tilføj alle materialer
        library.addResource(book1);
        library.addResource(book2);
        library.addResource(book3);
        library.addResource(movie);
        library.addResource(game);
        library.addResource(audioBook);

        // Vis bibliotekets materialer
        library.printResources();

        // Start brugergrænsefladen
        consoleUI.run();
    }
}





















