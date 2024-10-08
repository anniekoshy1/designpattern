package strategy;
import java.util.Collections;
import java.util.List;
public class BinarySearch implements SearchBehavior{
    @Override
    public boolean contains(List<Person> people, Person person){
        int index = Collections.binarySearch(people, person);
        return index >= 0;
    }
}