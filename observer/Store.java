/**
 * Annie Koshy
 * CSCE 247
 * Store
 * is an observer
 * displays best selling books
 * 
 */
package observer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Store implements Observer{
    private Subject subject;
    private Queue<Book> bestSellers;
    public Store(Subject subject){
        this.subject = subject;
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }
    @Override
    public void update(Book book){
        if (bestSellers.size() == 5){
            bestSellers.poll(); 
            // Removes oldest book if there's already five
        }
        bestSellers.offer(book);  
        // adds new book
    }
    public List<Book> getBestSellers(){
        return new LinkedList<>(bestSellers);  
        // if needed can convert queue to list
    }
}