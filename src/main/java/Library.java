import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    static List cart = new ArrayList<Book>();

   static Scanner scanner = new Scanner(System.in);
   static String userInput;
   static boolean loopCondition = true;
    
    public static void addBook(){
        while (loopCondition){
            System.out.println("Define a book. Or type done if youre finished.");
            System.out.println("What is the title?");
            String title = scanner.next();
            if (title == "done"){
                return;
            }
            System.out.println("How many pages does it have?");
            int pageCount = scanner.nextInt();
            System.out.println("What is the genre?");
            String genre = scanner.next();
            Book book = new Book(title, genre, pageCount);
            cart.add(book);
            // userInput = scanner
        }
        System.out.println("Your cart:");
        System.out.println(cart);
        scanner.close();
    }
}
