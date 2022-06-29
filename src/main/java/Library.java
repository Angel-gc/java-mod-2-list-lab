import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    static List<Book> cart = new ArrayList<Book>();

   static Scanner scanner = new Scanner(System.in);
   static String userInput;

    public static void addBook(){
        while (true){
            System.out.println("Define a book. Or type 1 if youre finished.");
            System.out.println("What is the title?");
            String title = scanner.next();
            if (title.equals("done")){
                break;
            } else {
            System.out.println("How many pages does it have?");
            int pageCount = scanner.nextInt();
            System.out.println("What is the genre?");
            String genre = scanner.next();
            Book book = new Book(title, genre, pageCount);
            cart.add(book);
            }
        }
        System.out.println("Your cart:");
        System.out.println(cart);
        scanner.close();
    }

    @Override
    public String toString() {
        return "Library []";
    }
}
