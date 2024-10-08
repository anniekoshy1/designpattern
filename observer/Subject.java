/**
 * Annie Koshy
 * CSCE 247
 * Subject
 * keeps track of observers
 */
package observer;
public interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Book book);  
}