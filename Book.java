import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{
    private int stock;
    private ArrayList<Integer> reviews; //not related to the String from review
    //use arrays or arraylists
    //rating in review should be int or double


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
    public void addReview(Review r){ //use arraylist?
        reviews.add(r.getRating());

    }
    public double getAverageRating(){
        double averageRating=0;
        for (int review:reviews){
            averageRating=+review;
        }
        averageRating=averageRating/reviews.size();
        return averageRating;
    }
    public void purchase(User user){
        Book book = new Book();
        user.getPurchasedMedia().add(book);
        //how to implement user taking out a book? why call user??
        stock--;
    }
    public boolean isBestSeller(){
        if (getAverageRating()>=4.5){
            return true;
        }else {
            return false;
        }

    }
    public void restock(int quantity){
         stock+=quantity;
         //add print?
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
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews +
                '}';
    }
}
