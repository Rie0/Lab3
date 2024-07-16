import java.util.ArrayList;

public class Novel extends Book{

    private String genre;

    //Constructor

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    //Getters Setters
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
        return "--" + getTitle() + "--\n" +
                "Type: " + getMediaType() + "\n" +
                "Author: " + getAuteur() + "\n" +
                "ISBN: " + getISBN() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Stock: " + getStock() + "\n" +
                "Genre: " + genre + "\n";
    }

}
