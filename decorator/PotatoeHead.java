/**
 * Annie Koshy
 * CSCE 247
 * Decorator
 * PotatoeHead Class
 * base design that can be decorated with additional features
 */
import java.util.ArrayList;

public class PotatoeHead extends Character {

    /**
     * Constructs a character with the given name and lines
     * string name = the name of the character
     */
    public PotatoeHead(String name) {
        super(new ArrayList<String>(), name);
        ArrayList<String> baseLines = FileReader.getLines("designpatterns/decorator/txt/potatoe-head.txt");
        this.lines.addAll(baseLines);
    }
}