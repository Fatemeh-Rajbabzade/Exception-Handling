import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    //add book
    public void addBook(Book book) throws InvalidBookException{
        if (book == null){
            throw new InvalidBookException("Book should not be null.");
        }
        books.add(book);
    }

    //find book by title
    private Book findBook(String title){
        for (Book book : books){
            if (book.getTitle().equals(title))
                return book;
            else
                return null;
        }
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException{
        if(books.size() == 0){
            throw new EmptyLibraryException("Library is empty, no books to borrow");
        }

        Book book = findBook(title);
        if (book == null){
            throw new BookNotFoundException("Book with title" + title + "not found.");
        }

        System.out.println("Successfully borrowed the book : " + book.toString());
    }

    //return book
    public void returnBook(String title) throws BookNotFoundException{
        Book book = findBook(title);
        if (book == null){
            throw new BookNotFoundException("Cannot return Book with title" + title + "not found.");
        }
        System.out.println("Successfullu returned : " +book.toString());
    }

    //Print info
    public void listBook() throws EmptyLibraryException{
        if (books.size() == 0)
        {
            throw new EmptyLibraryException("Library is empty.")
        }
        System.out.println("Book in the library:");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
    
    public ArrayList<Book> getBooks(){
        return books;
    }
}
