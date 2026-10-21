public class AudioBook extends Resource {

    public AudioBook(String isbn, String title, String author) {
        super(isbn, title, author);
    }

    @Override
    public String toString() {
        return "Lydbog: " + getTitle()
                + ", Forfatter: " + getCreator()
                + ", ISBN: " + getIdentifier();
    }
}