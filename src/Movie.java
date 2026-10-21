public class Movie extends Resource {

    public Movie(String ean, String title, String studio) {
        super(ean, title, studio);
    }

    @Override
    public String toString() {
        return "Film: " + getTitle()
                + ", Studie: " + getCreator()
                + ", EAN: " + getIdentifier();
    }
}