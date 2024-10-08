/**
 * Annie Koshy
 * CSCE 247
 * ArithmeticGame
 * manages the game state and score
 */

public class ArithemeticGame{  
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    public ArithemeticGame(){ 
        this.easyState = new Easy(this);
        this.mediumState = new Medium(this);
        this.hardState = new Hard(this);
        this.state = easyState;
        this.score = 0;
    }
    /**
     * Generates a new question by getting two numbers and an operation based on the current state
     * 
     * returns a new Question object for the user to answer
     */
    public Question getQuestion(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        Operation operation = state.getOperation();
        return new Question(num1, num2, operation);
    }

    /**
     * Increases score. If the score reaches a certain number right, it then increases the difficulty
     * Moves from Easy to Medium then moves from Medium to Hard
     */
    public void increaseScore(){
        this.score++;
    
        if (score >= 5 && score < 10 && state instanceof Easy){
            state.increaseDifficulty(); 
        } else if (score >= 10 && state instanceof Medium){
            state.increaseDifficulty();
        }
    
        System.out.println("Score: " + score);
    }
   
     /**
     * Deceases score. If the score reaches a certain number, it then decreases the level/difficulty
     * Moves from hard to medium then moves from medium to easy
     * Resets score after decreasing difficulty
     */
    public void decreaseScore(){
        this.score--;
    
        if (state instanceof Hard && score <= -3){
            state.decreaseDifficulty();
            this.score = 0;
            System.out.println("Level Decreased to: Medium");
        } else if (state instanceof Medium && score <= -3){
            state.decreaseDifficulty(); 
            this.score = 0; 
            System.out.println("Level Decreased to: Easy");
        } else if (state instanceof Easy){
            System.out.println("Already at the lowest level (Easy).");
        }
    
        System.out.println("Score: " + score);
    }
    
    
    public void setState(State state){
        this.state = state;
    }
    //Returns the Easy state of the game
    public State getEasyState(){
        return easyState;
    }
    //Returns the medium state of the game
    public State getMediumState(){
        return mediumState;
    }
    //Returns the hard state of the game
    public State getHardState(){
        return hardState;
    }
}