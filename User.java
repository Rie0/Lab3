import java.util.ArrayList;

public class User {
    private String userName;
    private String email;
    private ArrayList<Media> purchasedMedia = new ArrayList<>();
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    //Constructor

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    //Getters Setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMedia() {
        return purchasedMedia;
    }

    public void setPurchasedMedia(ArrayList<Media> purchasedMedia) {
        this.purchasedMedia = purchasedMedia;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    //Methods
    public void addToCart(Media media){
        shoppingCart.add(media);
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }
    public void checkout(){
        purchasedMedia.addAll(shoppingCart);
        shoppingCart.removeAll(shoppingCart);
    }

    @Override
    public String toString() {
        return "--User Details--\n" +
                "Username: " + userName + "\n" +
                "Email: " + email+ "\n";
    }

}
