import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration; //in mins

    //Getters Setters
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    //Methods

    public void watch(User user){
        Movie movie = new Movie();
        user.getPurchasedMedia().add(movie);

    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog){
        //how to add movies where the author is the same as the movie?
        for(Movie movie:)
        return movieCatalog;
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
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
