/**
 * Annie Koshy
 * CSCE 247
 * Decorator
 * Character Class
 * displays potatoe head character and name
 * has the basic structure of a character
 * this class can be modified by the decorators to add body parts to the potatoe head
 */
import java.util.ArrayList;

public class Character{
    private String name;
    protected ArrayList<String> lines;

    /**
     * Constructs a Character with a list of lines and a name.
     * lines = the lines that make up the character.
     * string name = he name of the character.
     */
    public Character(ArrayList<String> lines, String name){
        this.lines = lines;
        this.name = name;
    }

    /**
     * Gets the name of the character and prints it
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the string representation of the character by joining all of its lines.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (String line : lines){
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}