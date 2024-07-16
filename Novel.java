public class Novel extends Book{

    private String genre;

    //Get Set
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Methods

    @Override
    public String getMediaType() {
        if (isBestSeller()){
            return "Bestselling Novel";
        }else {
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
