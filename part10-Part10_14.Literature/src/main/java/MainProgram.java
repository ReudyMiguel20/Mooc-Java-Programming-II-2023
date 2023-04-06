
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        //Declaring variables.
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        String inputBookName = "";
        String inputAgeString = "";
        int inputAge = 0;

        while (true) {
            /*Making the loop for the user to put in the books, if the user press
            enter without entering some data, then the loop will end and all 
            the books will be printed.*/

            System.out.println("Input the name of the book, empty stops:");
            inputBookName = scanner.nextLine();

            if (inputBookName.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation:");
            inputAgeString = scanner.nextLine();

            if (inputAgeString.equals("")) {
                break;
            }

            inputAge = Integer.valueOf(inputAgeString);

            books.add(new Book(inputBookName, inputAge));

        }
        //User exited the loop, proceed to print all the books in the ArrayList.

        System.out.println(books.size() + " books in total.\n");

        //Using comparator to sort books by their age and name.
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getBookName);

        Collections.sort(books, comparator);

        //Printing all books to console ordered by age and name.
        System.out.println("Books:");
        for (Book e : books) {
            System.out.println(e.toString());
        }
    }

}
