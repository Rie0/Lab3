import java.util.List;

public class Music extends Media{
    private String artist;

    //Setters getters
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    //Methods

    public void listen(User user){
        //
    }
    public List<Music> generatePlaylist(List<Music> musicCatalog){

        //based on artist/author. why doesn't movie have something similar?
        return musicCatalog;
    }

    @Override
    public String getMediaType() {
        if (super.getPrice()>=10){
            return "Premium Music";
        }else {
            return "Music";
        }
    }
}
