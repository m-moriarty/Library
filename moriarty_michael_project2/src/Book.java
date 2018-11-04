import javax.swing.border.TitledBorder;

public class Book {
    private String AUTHOR;
    private String TITLE;
    private int YEAR;

    public Book(String author, String title, int year){
        AUTHOR = author;
        TITLE = title;
        YEAR = year;
    }
    public String toString(){
        return (AUTHOR + ", \"" + TITLE  + "\" (" + YEAR + ")");
    }
    public String getTitle(){
        return TITLE;

    }
    public String getAuthor(){
        return AUTHOR;
    }
}

