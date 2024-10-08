/**
 * Annie Koshy
 * CSCE 247
 * Medium
 * Medium state of the arithmetic game
 */
public class Medium implements State{
    private ArithemeticGame game; 

    public Medium(ArithemeticGame game){ 
        this.game = game;
    }

    @Override
    public int getNum(){
        return (int) (Math.random() * 50) + 1;
    }

    @Override
    public Operation getOperation(){
        return Operation.MINUS;
    }

    @Override
    public void increaseDifficulty(){
        game.setState(game.getHardState());
        System.out.println("Level Increased to: Hard");
    }

    @Override
    public void decreaseDifficulty(){
        game.setState(game.getEasyState());
        System.out.println("Level Decreased to: Easy");
    }
}