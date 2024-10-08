/*
 * @author Annie Koshy
 * TriviaGame Class
 */
package singleton;

import java.util.ArrayList;
import java.util.Random;
/*
 * Represents a trivia game that manages questions and tracks scores.
 * Utilizes a singleton instance.
 * Tracks the number of correct answers.
 * Keeps count of total questions asked.
 * Includes a random number generator.
 * Stores a list of trivia questions.
 */
public class TriviaGame{
    private static TriviaGame triviaGame; 
    private int score; 
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;
    /*
     * Initializes a new instance of TriviaGame.
     * Loads trivia questions using the DataLoader.
     */

    private TriviaGame(){
        this.score = 0;
        this.numGames = 0;
        this.rand = new Random();
        this.questions = DataLoader.getTriviaQuestions();
    }
   /*
     * Retrieves the singleton instance of TriviaGame.
     * @return The single instance of TriviaGame.
     */
    public static TriviaGame getInstance(){
        if (triviaGame == null){
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    /*
     * Retrieves a random trivia question from the list.
     * Ensures the question is removed to avoid repetition.
     * @return A random question, or null if no questions remain.
     */
    public Question getQuestion(){
        if (hasMoreQuestions()){
            int index = rand.nextInt(questions.size());
            return questions.remove(index);
        }
        return null;
    }
  /*
     * Determines if there are remaining questions to be asked.
     * @return True if more questions are available, false otherwise.
     */
    public boolean hasMoreQuestions(){
        return !questions.isEmpty();
    }
    /*
     * Increments the score for a correct answer and updates the total number of games played.
     */
    public void winRound(){
        score++;
        numGames++;
    }
    /*
     * Increments the total number of games played without adjusting the score.
     */
    public void loseRound(){
        numGames++;
    }
  /*
     * Returns the current score as a string.
     * @return The score and the total number of questions asked.
     */
    public String getScores(){
        return "You scored " + score + "/" + numGames;
    }
}