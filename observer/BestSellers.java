/**
 * Annie Koshy
 * CSCE 247
 * Best Sellers
 * organizes best selling books and notifies observers of them
 */
package observer;
import java.util.ArrayList;
import java.util.List;
public class BestSellers implements Subject{
    private ArrayList<Book> books;
    private ArrayList<Observer> observers;
    public BestSellers(){
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description){
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        books.add(book);
        notifyObservers(book); 
        // tells observers about the newly added book
    }
    public List<Book> getTopBooks(int n){
        return books.subList(0, Math.min(n, books.size()));
    }
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(Book book){
        for (Observer observer : observers){
            observer.update(book); 
            // tells observers with updated books
        }
    }
}