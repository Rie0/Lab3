public class Media {
    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    //Constructor

    public Media(String title, String auteur, String ISBN, double price) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
    }
    public Media(String title, String auteur, double price) {
        this.title = title;
        this.auteur = auteur;
        this.price = price;
    }
    public Media(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Media() {

    }

    //Getters Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Methods

    public String getMediaType(){
        return "Media";
    }

    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", price=" + price +
                '}'+ "\n";
    }
}
