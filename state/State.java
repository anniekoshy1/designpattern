/**
 * Annie Koshy
 * CSCE 247
 * State
 * State interface for the arithmetic game
 */
public interface State{
    int getNum();
    Operation getOperation();
    // Increases the difficulty level to the next state
    void increaseDifficulty();
    // Increases the difficulty level to the previous state
    void decreaseDifficulty();
}