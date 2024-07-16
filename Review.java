public class Review {
    private String user_name;
    private int rating;
    private String comment;

    //Constructor

    public Review(String user_name, int rating, String comment) {
        this.user_name = user_name;
        this.rating = rating;
        this.comment = comment;
    }

    //set get

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "--Review Details--\n" +
                "User: " + user_name + "\n" +
                "Rating: " + rating + "\n" +
                "Comment: " + comment+ "\n";
    }

}
