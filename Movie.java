import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    //Constructor
    public Movie(String title, String director, double price, int duration) {
        super(title, director, price); //changed the name of Auteur to Director
        this.duration = duration;
    }

    //Getters Setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    //Methods

    public void watch(User user){
        user.addToCart(this);
        user.checkout();

    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){

        ArrayList<Movie> listByDirector = new ArrayList<>();
        for (Movie movie: movieCatalog){
            if (movie.getAuteur().equalsIgnoreCase(this.getAuteur())){
                listByDirector.add(movie);
            }
        }
        return listByDirector;
    }

    @Override
    public String getMediaType() {
       if(duration>=120){
           return "Long Movie";
       }else{
           return "Movie";
       }

    }

    @Override
    public String toString() {
        return "--" + getTitle() + "--\n" +
                "Type: " + getMediaType() + "\n" +
                "Director: " + getAuteur() + "\n" +
                "Duration: " + duration + "\n" +
                "Price: " + getPrice()+ "\n";
    }

}
