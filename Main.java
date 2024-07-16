import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//--------------------------Initialize objects--------------------------------
//Create Medias
          //Books
        Book book1 = new Book("Book1","Auteur1","192831",
                15,100);
        Book book2 = new Book("Book2","Auteur2","129283",
                20,100);
        Book book3 = new Book("Book3","Auteur3","193283",
                10,100);
          //Novels
        Novel novel1 = new Novel("Novel1","Auteur1","23121",
                12,100,"Horror");
        Novel novel2 = new Novel("Novel2","Auteur1","23221",
                12,100,"Sci-fi");
        Novel novel3 = new Novel("Novel3","Auteur3","23521",
                12,100,"Drama");
          //Academic Books
        AcademicBook academicBook1 = new AcademicBook("Academic Book1","Auteur2","33456",
                20,100,"Math");
        AcademicBook academicBook2 = new AcademicBook("Academic Book2","Auteur2","33457",
                20,100,"Physics");
        AcademicBook academicBook3 = new AcademicBook("Academic Book3","Auteur2","33458",
                20,100,"Chemistry");
          //Music
        Music music1 = new Music("Music1","Artist1",15);
        Music music2 = new Music("Music2","Artist2",12);
        Music music3 = new Music("Music3","Artist3",5);
        Music music4 = new Music("Music4","Artist1",15);
          //Movies
        Movie movie1 = new Movie("Movie1","Director1",30,180);
        Movie movie2 = new Movie("Movie2","Director1",25,100);
        Movie movie3 = new Movie("Movie3","Director2",30,220);
        Movie movie4 = new Movie("Movie4","Director1",30,160);

//Create Users
        User user1 = new User("User1","User1@gmail.com");
        User user2 = new User("User2","User2@gmail.com");
        User user3 = new User("User3","User3@gmail.com");

//--------------------------Store----------------------------------------------
        Store store=new Store();

        //Add media to store
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(novel3);
        store.addMedia(academicBook1);
        store.addMedia(academicBook2);
        store.addMedia(academicBook3);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(music4);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);
        store.addMedia(movie4);

        //Add users to store
        store.addUser(user1);
        store.addUser(user2);
        store.addUser(user3);

//Other Store Methods
        System.out.println("Medias:");
        System.out.println(store.displayMedias());
        System.out.println("\nUsers:");
        System.out.println(store.displayUsers());
        System.out.println("\nSearch for Book:");
        System.out.println("Searched book: "+store.searchBook("Book1")); //found case
        System.out.println("Searched book: "+store.searchBook("Book17")); // Not found case
        System.out.println();

//--------------------------Reviews-------------------------------------------

        Review review1 = new Review("User1",4,"Good book");
        Review review2 = new Review("User2",5,"Great book");
        Review review3 = new Review("User3",5,"Great book");
        Review review4 = new Review("User2",4,"Good book");

//--------------------------Books-------------------------------------------

        //addReview method
        book1.addReview(review1);
        book1.addReview(review2);
        book1.addReview(review3);
        book2.addReview(review4);
        //getReviews
        System.out.println("Book1 reviews: "+book1.getReviews());
        //getAverageRating method
        System.out.println("Book1 reviews average: "+book1.getAverageRating());
        System.out.println();
        //Compare getMediaType method for two books with different reviews
        System.out.println(book1.getMediaType());
        System.out.println(book2.getMediaType());
        System.out.println();
        //restock method
        book1.restock(20);
        System.out.println("Book1 after user restocking 20 copies: "+book1);
        System.out.println();

        //purchase method
        book1.purchase(user1); // is equal to listen and watch methods
        System.out.println("Book1 after user purchased one copy: "+book1);
        System.out.println();
//--------------------------Novel-------------------------------------------
        System.out.println("Novel1 genre: "+novel1.getGenre());
        System.out.println("Novel1 type: "+novel1.getMediaType());
        System.out.println();
//----------------------Academic book---------------------------------------
        System.out.println("Academic Book1 Subject: "+academicBook1.getSubject());
        System.out.println("Academic Book1 type: "+academicBook1.getMediaType());
        System.out.println();

//--------------------------Music-------------------------------------------
        music1.listen(user1);
        System.out.println("User1 purchase history after listening to music1: "+user1.getPurchasedMedia());
        System.out.println();
        //recommend based on Artist1
        ArrayList<Music> music = new ArrayList<>();
        music.add(music1);
        music.add(music2);
        music.add(music3);
        music.add(music4);
        System.out.println("Recommended music: "+music1.generatePlaylist(music));
        System.out.println();
        System.out.println(music1.getMediaType());
        System.out.println(music3.getMediaType());
        System.out.println();
//--------------------------Movie-------------------------------------------
        movie1.watch(user1);
        System.out.println("User1 purchase history after watching movie1: "+user1.getPurchasedMedia());
        System.out.println();
        //recommend based on director
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        System.out.println("Recommended movies: "+movie1.recommendSimilarMovies(movies));
        System.out.println();
        //Get media type comparison
        System.out.println(movie1.getMediaType());
        System.out.println(movie2.getMediaType());
        System.out.println();
//--------------------------User-------------------------------------------
        //User Methods
        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(novel1);
        System.out.println("User1 shopping cart after adding medias: "+user1.getShoppingCart());
        user1.removeFromCart(novel1);
        System.out.println("User1 shopping cart after removing novel1: "+user1.getShoppingCart());
        user1.checkout();
        System.out.println("User1 shopping cart after checking out: "+user1.getShoppingCart());
        System.out.println("Purchased medias: "+user1.getPurchasedMedia());

    }
}