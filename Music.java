import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    //Constructor
    public Music(String title, String artist, double price) {
        super(title, price);
        this.artist = artist;
    }
    //Setters getters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    //Methods

    public void listen(User user){
        user.addToCart(this);
        user.checkout();
    }
    public ArrayList<Music> generatePlaylist(ArrayList<Music> musicCatalog){

        ArrayList<Music> listByArtist = new ArrayList<>();
        for (Music music: musicCatalog){
            if (music.getArtist().equalsIgnoreCase(this.getArtist())){
                listByArtist.add(music);
            }
        }
        return listByArtist;
    }

    @Override
    public String getMediaType() {
        if (getPrice()>=10){
            return "Premium Music";
        }else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "--" + getTitle() + "--\n" +
                "Type: " + getMediaType() + "\n" +
                "Artist: " + getArtist() + "\n" +
                "Price: " + getPrice()+ "\n";
    }

}
