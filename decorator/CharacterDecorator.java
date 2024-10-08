/**
 * Annie Koshy
 * CSCE 247
 * Decorator
 * CharacterDecorator Class
 * allows body parts to be added to the character
 */
import java.util.ArrayList;

public abstract class CharacterDecorator extends Character{
    protected Character character;

    /**
     * character is the potatoe head that needs to be decorated with features
     */
    public CharacterDecorator(Character character){
        super(character.lines, character.getName());
        this.character = character;
    }

    /**
     * Integrates decor (body parts) into the character's lines.
     */
    protected abstract void integrateDecor(ArrayList<String> decor);
    public String toString(){
        return character.toString();
    }
}