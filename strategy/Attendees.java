package strategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Attendees{
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;
    public Attendees(String title){
        this.title = title;
        this.people = new ArrayList<>();
<<<<<<< HEAD
        this.searchBehavior = new LinearSearch(); 
    }
    public Person add(String firstName, String lastName, String phoneNumber, String reminder){
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (searchBehavior.contains(people, person)){
            return null;
        } else{
=======
        this.searchBehavior = new LinearSearch();
    }
    public Person add(String firstName, String lastName, String phoneNumber, String reminder){
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (searchBehavior.contains(people, person)) {
            return null;
        } else {
>>>>>>> 5b74ce7f7187377010299080810060b58f1ab976
            people.add(person);
            Collections.sort(people);
            return person;
        }
    }
    public String getTitle(){
        return title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;
    }
    public List<Person> getList(){
        return people;
    }
}