/**
 * Annie Koshy
 * CSCE 247
 * Fan Reads
 * is an observer
 * keeps track of best selling books
 */
package observer;
import java.util.ArrayList;
import java.util.HashMap;
public class FanReads implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName;
    private HashMap<Genre, ArrayList<Book>> recommendations;
    public FanReads(Subject subject, String firstName, String lastName){
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.recommendations = new HashMap<>();
        subject.registerObserver(this);
    }
    @Override
    public void update(Book book){
        Genre genre = book.getGenre();
        recommendations.putIfAbsent(genre, new ArrayList<>());
        recommendations.get(genre).add(book);
    }
    public ArrayList<Book> getRecommendations(Genre genre){
        return recommendations.getOrDefault(genre, new ArrayList<>());
    }
}