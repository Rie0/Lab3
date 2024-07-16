public class AcademicBook extends Book{
    String subject;

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
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
