/**
 * Annie Koshy
 * CSCE 247
 * Hard
 * hard state of the arithmetic game
 */
public class Hard implements State{
    private ArithemeticGame game; 

    public Hard(ArithemeticGame game){ 
        this.game = game;
    }

    @Override
    public int getNum(){
        return (int) (Math.random() * 100) + 1;
    }

    @Override
    public Operation getOperation(){
        return Operation.MULTIPLY;
    }

    @Override
    public void increaseDifficulty(){
    }

    @Override
    public void decreaseDifficulty(){
        game.setState(game.getMediumState());
        System.out.println("Level Decreased to: Medium");
    }
}