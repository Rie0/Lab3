import java.util.ArrayList;

public class Store {
    private ArrayList<User> users;
    private ArrayList<Media> medias;
    //Getters Setters

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;
    }

    //Methods
    public void addUser(User user){
        users.add(user);
    }
    public ArrayList<User> displayUsers(){
       return users;
    }
    public void addMedia(Media media){
        medias.add(media);
    }
    public ArrayList<Media> displayMedias(){
        return medias;
    }
}
