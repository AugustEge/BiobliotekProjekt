public class VideoGame extends Resource {

    public VideoGame(String ean, String title, String studio) {
        super(ean, title, studio);
    }

    @Override
    public String toString() {
        return "Videospil: " + getTitle()
                + ", Studie: " + getCreator()
                + ", EAN: " + getIdentifier();
    }
}