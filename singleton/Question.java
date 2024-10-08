/*
 * @author Annie Koshy
 * Question Class
 */
package singleton;
import java.util.ArrayList;
/*
 * Represents a multiple-choice trivia question.
 * Contains the question prompt, a list of possible answers, and the correct answer
 */
public class Question{
    private String question;
    private ArrayList<String> answers; 
    private int correctAnswer; 
    /*
     * Constructor to initialize a Question object
     * @param question  The question 
     * @param correctAnswer Index of correct answer
     * @param answers   Possible answers
     */
    public Question(String question, int correctAnswer, String... answers){
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>();
        for (String answer : answers){
            this.answers.add(answer);
        }
    }
   /*
     * Provides a string representation of the question and its answer options.
     * @return A formatted string displaying the question and possible answers.
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(question + "\n");
        for (int i = 0; i < answers.size(); i++){
            sb.append(" " + (i + 1) + ". " + answers.get(i) + "\n");
        }
        return sb.toString();
    }
 /*
     * Verifies if the user's answer is correct.
     * @param userAnswer The answer provided by the user.
     * @return True if the answer is correct, false otherwise.
     */
    public boolean isCorrect(int userAnswer){
        return userAnswer - 1 == correctAnswer; 
    }
  /*
     * Retrieves the correct answer option.
     * @return The correct answer.
     */
    public String getCorrectAnswer(){
        return answers.get(correctAnswer);
    }
}