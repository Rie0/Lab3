import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Integer> reviews = new ArrayList<>();

    //Constructor

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Integer> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
    }

    public Book() {
        super();
    }

    //Getters Setters
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Integer> reviews) {
        this.reviews = reviews;
    }

    //Methods
    public void addReview(Review r){
        reviews.add(r.getRating());

    }
    public double getAverageRating(){
        if (reviews.isEmpty()) {
            return 0;
        }else{
        double averageRating=0;
        for (int review:reviews){
            averageRating+=review;

        }
        if (averageRating==0){
            return 0;
        }else {
            averageRating=averageRating/reviews.size();
        }
        return averageRating;
        }
    }
    public void purchase(User user){
        user.addToCart(this);
        user.checkout();
        System.out.println("Book purchased!");
        stock--;
    }
    public boolean isBestSeller(){
        return getAverageRating()>=4.5;

    }
    public void restock(int quantity){
         stock+=quantity;
    }

    @Override
    public String getMediaType() {
        if (isBestSeller()){
            return "Bestselling Book";
        }else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return "--" + getTitle() + "--\n" +
                "Type: " + getMediaType() + "\n" +
                "Author: " + getAuteur() + "\n" +
                "ISBN: " + getISBN() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Stock: " + stock + "\n" +
                "Reviews: " + reviews+ "\n";
    }

}
