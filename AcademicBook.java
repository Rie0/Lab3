import java.util.ArrayList;

public class AcademicBook extends Book{
    String subject;

    //Constructor

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    //Set gets

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //Methods
    @Override
    public String getMediaType() {
        if (isBestSeller()){
            return "Bestselling Academic Book";
        }else {
            return "Academic Book";
        }
    }

    @Override
    public String toString() {
        return "--" + getTitle() + "--\n" +
                "Type: " + getMediaType() + "\n" +
                "Author: " + getAuteur() + "\n" +
                "ISBN: " + getISBN() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Stock: " + getStock() + "\n" +
                "Subject: " + subject+ "\n";
    }

}
