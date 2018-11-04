import java.lang.reflect.Array;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> BOOKS;

    public Library(){
        BOOKS = new ArrayList<Book>();
    }

    public void add(Book toAdd){
        BOOKS.add(toAdd);
        System.out.println(toAdd + " was successfully added to the library.");
    }

    public void listAllBooks(){
        if (BOOKS.size() >=1) {
            for (int i = 0; i < BOOKS.size(); i++) {
                System.out.println(i + ". " + BOOKS.get(i));
            }
        }
         else {
             System.out.println("There are no books in the library currently.");
        }
    }

    public void findBooksByTitle( String searchedTitle) {
        ArrayList <Book> booksFound = new ArrayList<Book>();
        //test all books to see if book exists.
        for (int i = 0; i < BOOKS.size(); i++) {
            if (BOOKS.get(i).getTitle().equals(searchedTitle)) {
                  booksFound.add(BOOKS.get(i));
            }
        }
        if(booksFound.size() > 0){
            System.out.println(booksFound);
        }
        else{
            System.out.println("Sorry there are currently no books in the library with that TITLE.");
        }
    }
    public void findAllBookByAuthor( String searchedAuthor){
        ArrayList <Book> booksFound = new ArrayList<Book>();
        for (int i = 0; i < BOOKS.size(); i++) {
            if (BOOKS.get(i).getAuthor().equals(searchedAuthor)) {
                booksFound.add(BOOKS.get(i));
            }
        }
        if(booksFound.size() > 0){
            System.out.println(booksFound);
        }
        else{
            System.out.println("Sorry there are currently no books in the library by that AUTHOR.");
        }
    }

}
