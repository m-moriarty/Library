import java.util.Scanner;

public class MainMenu {
    private final static String[] menuOptions = new String[]{"Add a book", "List all books", "Find a book (by title)", "Find all books (by author)", "Quit"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library l1 = new Library();
        Boolean menu = true;

        while(menu){
            for (int i=0;i<=4;i++) {
            System.out.println("[" + (i + 1) + "] " + menuOptions[i]);
            }

            if (sc.hasNextInt()){
                int menuInput = sc.nextInt();
                if (menuInput == 1) {//add a book
                    sc.nextLine();  // read the newline
                    System.out.println("ENTER Author of book");
                    String author = sc.nextLine();
                    System.out.println("ENTER Title of book");
                    String title = sc.nextLine();
                    System.out.println("ENTER Year of book");
                    int year = sc.nextInt();
                    Book b1 = new Book(author, title, year);
                    l1.add(b1);
                    continue;
                }
                else if (menuInput == 2){//L:st all books
                    l1.listAllBooks();
                    continue;
                }
                else if (menuInput == 3){//Search books by title
                    sc.nextLine();
                    System.out.println("ENTER Title you wish to search.");
                    String searchedTitle = sc.nextLine();
                    l1.findBooksByTitle(searchedTitle);

                    continue;
                }
                else if (menuInput == 4){
                    sc.nextLine();
                    System.out.println("ENTER Author you wish to search.");
                    String searchedAuthor = sc.nextLine();
                    l1.findAllBookByAuthor(searchedAuthor);

                    continue;
                }
                else if (menuInput == 5){
                    menu = false;
                    System.out.println("Thank you for visiting the library, please come again soon!%#$!@^...");
                    continue;
                }
            }
            else{
                System.out.println("Looking for INTEGER input.");
            }
        }
//        Book b1 = new Book("Edgar Allen Poe", "The Raven", 1845);
//        Book b2 = new Book("Stephen King" ,"Christine", 1980);
//        System.out.println(b1);
//        System.out.println(b2);

    }
}
