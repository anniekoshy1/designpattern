/**
 * Annie Koshy
 * CSCE 247
 * Easy
 * Easy state of the arithmetic game
 */
public class Easy implements State{
    private ArithemeticGame game; 

    public Easy(ArithemeticGame game){ 
        this.game = game;
    }

    @Override
    public int getNum(){
        return (int) (Math.random() * 10) + 1;
    }

    @Override
    public Operation getOperation(){
        return Operation.PLUS;
    }

    @Override
    public void increaseDifficulty(){
        game.setState(game.getMediumState());
        System.out.println("Level Increased to: Medium");
    }

    @Override
    public void decreaseDifficulty(){
        // No lower difficulty than easy
    }
}